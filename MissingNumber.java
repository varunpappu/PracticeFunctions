##Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

##For example,
##Given nums = [0, 1, 3] return 2.


public class Solution {
    public int missingNumber(int[] nums) {
        
        int[] count = new int[100000];
        int missing = 0;
        
        for(int i = 0; i < nums.length; i ++){
            count[nums[i]]++;
        }
        
        for(int i = 0; i < nums.length + 1; i ++){ // + 1 needed for test case when array is of the form [0]. 
            if(count[i] == 0)						// Expected result [0,1]
                missing = i;
        }
        return missing;
    }
}