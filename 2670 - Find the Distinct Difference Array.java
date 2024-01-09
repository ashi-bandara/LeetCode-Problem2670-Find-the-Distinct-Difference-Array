import java.util.Arrays;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] difference = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int[] suffix = new int[nums.length - i - 1];
            int[] prefix = new int[i + 1];

            // Populate prefix using System.arraycopy
            System.arraycopy(nums, 0, prefix, 0, i + 1);

            // Populate suffix
            for (int j = i + 1; j < nums.length; j++) {
                suffix[j - (i + 1)] = nums[j];
            }
            difference[i] = countDistinct(prefix) - countDistinct(suffix);
        }
        return difference;
    }

    private int countDistinct(int[] array) {
        return (int) Arrays.stream(array).distinct().count();
    }
}
