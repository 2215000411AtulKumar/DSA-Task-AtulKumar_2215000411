class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int[] c = new int[n1.length + n2.length];
        for (int i = 0; i < n1.length; i++) {
            c[i] = n1[i];
        }
        for (int i = 0; i < n2.length; i++) {
            c[n1.length + i] = n2[i];
        }
        Arrays.sort(c);
        int len = c.length;
        if (len % 2 != 0) {
           
            return (double)c[len / 2];
        } else {
            
            return (c[len / 2] + c[(len / 2) - 1]) / 2.0;
        }
    }
}
