class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for(int num : arr){
            sum += num;
        }
        
        if(sum % 3 != 0) return false;

        int sumForEachPart = sum / 3, temp = 0, found = 0;

        for(int i = 0; i<arr.length; i++){
            temp += arr[i];

            if(temp == sumForEachPart){
                found++;
                temp = 0;
            }
        }

        if(found >= 3) return true;

        return false;

    }
}