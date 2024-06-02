public class RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
            }
            nums[k + 1] = nums[i];
        }
        return k + 2;
    }
}
