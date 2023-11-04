package Basic;


public class MaximumValue {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 18, 3, 27};
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value

        for (int number : numbers) {
            if (number > max) {
                max = number; // Update the maximum if a larger value is found
            }
        }

        if (max == Integer.MIN_VALUE) {
            System.out.println("No maximum value found."); // Handle the case where no valid maximum exists
        } else {
            System.out.println("The maximum value is: " + max);
        }
    }
}
