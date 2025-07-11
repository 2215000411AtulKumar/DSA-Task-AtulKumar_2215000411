class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        while(k >0){
            nums[0] *= (-1); 
            Arrays.sort(nums);

            k--;
        }

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}