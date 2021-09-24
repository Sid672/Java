/**
*Author: aschkun [https://github.com/aschkun];
*Link of the question is mentioned below
*https://leetcode.com/problems/missing-number/
**/


class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length ){
            int correctIndex = nums[i] ;
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i , correctIndex);
            }else{
                i++;
            }

        }
        for (int index = 0;index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;

    }
     public void swap(int[] arr,int start,int finish){
        int temp = arr[start];
        arr[start] = arr[finish];
        arr[finish] = temp;
    }
}
