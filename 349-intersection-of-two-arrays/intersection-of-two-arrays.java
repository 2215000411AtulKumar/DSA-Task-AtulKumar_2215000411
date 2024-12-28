class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        ArrayList<Integer> res = new ArrayList<>();
        int prevEle = Integer.MIN_VALUE;

        for (int i = 0; i < nums1.length; i++) {
            if (prevEle != nums1[i]) {
                int low = 0, high = nums2.length - 1, mid;

                while (low <= high) {
                    mid = low + (high - low) / 2;

                    if (nums2[mid] == nums1[i]) {
                        res.add(nums1[i]);
                        break;
                    } else if (nums1[i] > nums2[mid]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                prevEle = nums1[i];
            }
        }

        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}