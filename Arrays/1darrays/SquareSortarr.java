public class SquareSortarr {
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] temp1 = sortedSquares(arr);

        for (int i = 0; i < temp1.length; i++) {
            System.out.println(temp1[i]);
        }
    }
}
