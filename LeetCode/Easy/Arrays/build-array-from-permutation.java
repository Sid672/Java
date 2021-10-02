/**
*Authur : shubh22121 [https://github.com/shubh22121];
*Link for the question is mentioned below
*https://leetcode.com/problems/build-array-from-permutation/
**/

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans= new int[nums.length];
        for (int i = 0; i < ans.length; i++){
            ans[i]=nums[nums[i]];
        }

        return ans;
        
    }
}
