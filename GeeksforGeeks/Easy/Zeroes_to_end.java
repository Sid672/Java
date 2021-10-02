/**
*Author: noob0412 [https://github.com/noob0412];
*Link of the question is mentioned below
https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1#
**/
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; 
        while (count < n)
            arr[count++] = 0;
    }