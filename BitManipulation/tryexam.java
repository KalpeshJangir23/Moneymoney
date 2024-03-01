package BitManipulation;

public class tryexam {
    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 10;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits for " + number + ": " + sum);
    }
}
