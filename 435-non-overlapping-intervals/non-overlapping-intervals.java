class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        if(intervals.length <= 1){
            return 0;
        }

        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int end = Integer.MIN_VALUE;
        int ansCount = 0;

        for(int[] interval : intervals){
            if(interval[0] >= end){
                end = interval[1];
            }
            else{
                count++;
            }
        } 
        return count;
    }
}