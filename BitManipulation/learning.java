package BitManipulation;

public class learning {
    public static int countOnes(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1; // Check the rightmost bit
            number = number >>> 1; // Shift bits to the right
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 011001; // Replace this with your desired number
        int onesCount = countOnes(num);
        System.out.println("Number of ones in " + num + " (binary): " + onesCount);
    }
}
