class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index =-1;
        int min_manhattan=Integer.MAX_VALUE;
        for(int i=0; i<points.length; i++){
            int x1 = points[i][0];
            int y1= points[i][1];
            int temp_manhattan = Math.abs(x-x1) + Math.abs(y-y1);

            if( (x == x1 || y == y1) && temp_manhattan < min_manhattan){
                min_manhattan = temp_manhattan;
                index = i;
            }
        }
        return index;
    }
}