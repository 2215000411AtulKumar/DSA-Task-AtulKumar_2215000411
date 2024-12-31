class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+") && arr.size() >= 2) {
                arr.add(arr.get(arr.size() - 1) + arr.get(arr.size() - 2));
            } else if (operations[i].equals("C")) {
                if (arr.size() >= 1) {
                    arr.remove(arr.size() - 1);
                }
            } else if (operations[i].equals("D")) {
                if (arr.size() >= 1) {
                    arr.add(2 * arr.get(arr.size() - 1));
                }
            } else {
                arr.add(Integer.parseInt(operations[i]));
            }
        }

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }
}