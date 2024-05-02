public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray remover = new RemoveDuplicatesSortedArray();
        int[] testArray = {1, 1, 1, 2, 2, 3};

        int newLength = remover.removeDuplicates(testArray);

        System.out.println("New length of the array is: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
