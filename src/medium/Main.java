package medium;

import java.util.Arrays;

public class Main {
    // RemoveDuplicatesSortedArrayII

//    public static void main(String[] args) {
//        RemoveDuplicatesSortedArrayII remover = new RemoveDuplicatesSortedArrayII();
//        int[] testArray = {0,0,1,1,1,1,2,3,3};
//
//        int newLength = remover.removeDuplicates(testArray);
//
//        System.out.println("New length of the array is: " + newLength);
//        System.out.print("Array after removing duplicates: ");
//        for (int i = 0; i < newLength; i++) {
//            System.out.print(testArray[i] + " ");
//        }
//    }

    // RotateArray
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums1, k1);
        System.out.println("Rotated array: " + Arrays.toString(nums1));

        // Test case 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotateArray.rotate(nums2, k2);
        System.out.println("Rotated array: " + Arrays.toString(nums2));
    }
}
