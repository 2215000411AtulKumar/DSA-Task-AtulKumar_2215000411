class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>()); 

        for (int num : nums) {
            int currentSize = res.size();
            for (int i = 0; i < currentSize; i++) {
                List<Integer> newSubset = new ArrayList<>(res.get(i));
                newSubset.add(num);   // add current number to existing subset
                res.add(newSubset);   
            }
        }

        return res;
    }
}
