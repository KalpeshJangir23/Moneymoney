package Basic;

public class trykarna {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int num4 = 8;

        if (areAllEvenOrOdd(num1, num2, num3, num4)) {
            System.out.println("All four numbers are either even or odd.");
        } else {
            System.out.println("Not all four numbers are either even or odd.");
        }
    }

    public static boolean areAllEvenOrOdd(int... numbers) {
        boolean allEven = true;
        boolean allOdd = true;

        for (int num : numbers) {
            if (num % 2 == 0) {
                allOdd = false;
            } else {
                allEven = false;
            }
        }

        return allEven || allOdd;
    }
}
