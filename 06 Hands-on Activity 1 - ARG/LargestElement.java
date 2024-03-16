public class LargestElement {

    public static void main(String[] args) {
        // Sample array (replace with your actual array)
        int[] numbers = {25, 11, 7, 75, 56};

        // Initialize variables
        int largest = numbers[0]; // Assuming the first element is the largest initially

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}