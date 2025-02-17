class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int deficit = 0;
        int currFuel = 0;
        int start = 0;
        for(int i =0;i<gas.size();i++){
            currFuel += gas[i]-cost[i]; 
            if(currFuel<0){
                deficit+=currFuel;
                start = i+1;
                currFuel = 0;
            }
        }
        if(currFuel+deficit>=0) return start;
        return -1;
    }
};