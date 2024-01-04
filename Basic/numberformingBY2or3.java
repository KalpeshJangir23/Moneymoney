package Basic;

public class numberformingBY2or3 {

    public static int minOperations(int num) {
        if (num < 0) {
            return -1; // Invalid input for negative numbers
        }

        int count = 0;

        while (num % 3 != 0) {
            num -= 2; // Reduce the number by 2 until it becomes divisible by 3
            count++;
            if (num < 0) {
                return -1; // If the number becomes negative, it cannot be formed
            }
        }


        return count + num / 3; // Total count is the number of 2s used plus the number of remaining 3s
    }

    public static void main(String[] args) {
        int numberToCheck = 10;

        int minOps = minOperations(numberToCheck);

        if (minOps != -1) {
            System.out.println("Minimum number of operations to form " + numberToCheck + " using only 2s and 3s: " + minOps);
        } else {
            System.out.println(numberToCheck + " cannot be formed using only 2s and 3s.");
        }


    }
}
