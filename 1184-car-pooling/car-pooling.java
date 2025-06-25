class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] counts = new int[1001];
         
        for(int i =0; i<trips.length; i++){
            int passengers = trips[i][0];
            int start = trips[i][1];
            int end = trips[i][2];

            counts[start] += passengers;
            counts[end]   -= passengers;
        }
        int inCar = 0;
        for(int count : counts){
            inCar += count;
            if(inCar > capacity){
                return false;
            }
        }

        return true;
    }
}