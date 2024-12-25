class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for(int i=0; i<len; i++){
            sum += nums[i];
        }
        int actualSum = (len*(len+1))/2;

        return actualSum - sum;
    }
}