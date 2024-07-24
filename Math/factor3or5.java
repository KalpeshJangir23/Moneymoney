package Math;

public class factor3or5 {

    // Function to calculate the number of ideal numbers within the range [low, high]
    public static long countIdealNumbers(long low, long high) {
        long count = 0;

        // Calculate the maximum powers of 3 and 5 within the given range
        int maxPower3 = (int) (Math.log(high) / Math.log(3));
        int maxPower5 = (int) (Math.log(high) / Math.log(5));

        // Loop through all combinations of powers of 3 and 5 within the range
        for (int power3 = 0; power3 <= maxPower3; power3++) {
            for (int power5 = 0; power5 <= maxPower5; power5++) {
                long idealNumber = (long) Math.pow(3, power3) * (long) Math.pow(5, power5);
                if (idealNumber >= low && idealNumber <= high) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        long low = 200;
        long high = 405;
        
        // Find the number of ideal numbers within the range
        System.out.println(countIdealNumbers(low, high));
    }
}
