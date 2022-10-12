import java.util.HashMap;
/*2022/10/12 18:39
Given two strings s and t of lengths m and n respectively,

return the minimum window substring of s such that every character in t (including duplicates) is included in the window.

If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

A substring is a contiguous sequence of characters within the string.

哈希 双指针 滑动窗口
* */
class Solution76 {
    HashMap<Character, Integer> win;
    HashMap<Character, Integer> need;
    public String minWindow(String s, String t) {
        // s为主串 t为辅串
        // 题目要求在主串中找到一个子串包含有t中的所有字符
        int m = s.length();
        int n = t.length();
        if(n>m) return "";

        win = new HashMap<>();
        need = new HashMap<>();
        for(char ch: t.toCharArray()){
            need.put(ch, need.getOrDefault(ch, 0)+1);
        }

        int minLen = Integer.MAX_VALUE;
        String res="";
        int left=0, right=0;
        while(right<m){
            char c1 = s.charAt(right);
            win.put(c1, win.getOrDefault(c1, 0)+1);
            //System.out.println(checkSatisfy());
            while (checkSatisfy()){
                int curLen = right-left+1;
                if(curLen<minLen){
                    minLen = curLen;
                    res = s.substring(left, right+1);
                }
                char c2 = s.charAt(left);
                win.put(c2, win.get(c2)-1);
                left++;
            }
            right++;
        }

        return res;
    }

    public boolean checkSatisfy(){
        // 用于判断当前窗口所代表的子字符串是否能够覆盖子串t
        for (Character key : need.keySet()) {
            if(!win.containsKey(key) || win.get(key)<need.get(key)){
                return false;
            }
        }
        return true;
    }
}

