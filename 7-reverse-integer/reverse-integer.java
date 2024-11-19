class Solution {
    public int reverse(int x) {
       
        int copy = x;
        int new_x=0;
        int rem = 0;
        while(x!=0){
            rem = x%10;
            if(new_x<Integer.MIN_VALUE/10 || new_x>Integer.MAX_VALUE/10) return 0;
            new_x =(new_x*10)+rem;
            x /= 10;
        }
    
        return new_x; 
        
    }
}