class Solution {
    public int integerReplacement(int n) {
        int c=0; 
        if(Integer.MAX_VALUE == n){
            return 32;
        }

        while(n>1){
            if((n&1)==0){
                n >>>=1;
            }
            else if(n == 3 || Integer.bitCount(n+1)>Integer.bitCount(n-1)){
                --n;
            }
            else{
                ++n;
            }
            ++c;
        }
        return c;
    }
}