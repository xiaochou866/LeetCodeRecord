import java.util.Arrays;

/*
Given two integer arrays nums1 and nums2,
return the maximum length of a subarray that appears in both arrays.
* */
public class Solution718 {
    public int findLength(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;

        int res = 0;
        // dp[i][j] 表示 nums1的前i个数字 nums2的前j个数字 所构成的两个数组
        // 上述两个数组的公共子串的最大长度
        int[][] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                    res = dp[i][j]>res?dp[i][j]:res;
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        // 展示dp数组
        //for(int[] dpRow: dp){
        //    System.out.println(Arrays.toString(dpRow));
        //}
        return res;
    }
}
