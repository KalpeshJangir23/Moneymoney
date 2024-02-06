package BitManipulation;

public class MaximumOr {

    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 3, 5, 1, 5, 4, 7, 9, 7, 9 };
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(xor + "^" + arr[i]);
            xor = xor ^ arr[i];
            System.out.print(xor + " ");
        }
        System.out.println(" ");
        System.out.println(xor);
    }
}
