class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int nonZeroProduct = 1;

        for (int val : nums) {
            if (val == 0) {
                zeroCount++;
            } else {
                nonZeroProduct *= val;
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                result[i] = 0;
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? nonZeroProduct : 0;
            } else {
                result[i] = nonZeroProduct / nums[i];
            }
        }

        return result;
    }
}