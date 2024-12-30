class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] tempArr = new int[image.length][image.length];
        int[][] newArr = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                int m = image[i].length - 1;
                tempArr[i][j] = image[i][m - j];
            }
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                newArr[i][j] = reversalArr(tempArr[i][j]);
            }
        }

        return newArr;

    }
    static int reversalArr(int num) {
        if (num == 1) {
            return 0;
        } else if (num == 0) {
            return 1;
        }
        return -1;
    }
}