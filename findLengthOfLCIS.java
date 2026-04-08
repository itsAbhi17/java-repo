public class findLengthOfLCIS {
    public static void main(String[] args) {
        LCIS sol = new LCIS();

        int[] nums1 = {1, 3, 5, 4, 7};
        int[] nums2 = {2, 2, 2, 2, 2};
        int[] nums3 = {1, 2, 3, 4};

        System.out.println(sol.findLengthOfLCIS(nums1)); // 3
        System.out.println(sol.findLengthOfLCIS(nums2)); // 1
        System.out.println(sol.findLengthOfLCIS(nums3)); // 4
    }
}

class LCIS {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxlen = 1;
        int curlen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curlen++;
                maxlen = Math.max(maxlen, curlen);
            } else {
                curlen = 1;
            }
        }

        return maxlen;
    }
}
