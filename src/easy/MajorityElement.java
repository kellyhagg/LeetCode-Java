package easy;

import java.util.Arrays;

//class MajorityElement {
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];
//    }
//}

// O(n) time complexity, O(1) space complexity
// Boyer-Moore Voting Algorithm
class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count++;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
