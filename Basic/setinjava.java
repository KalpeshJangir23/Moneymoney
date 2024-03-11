package Basic;

public class setinjava {
    public static void main(String[] args) {
        int[] myList = { 6, 3, 6 };
        int givenNumber = 4   ;

        int lowerBoundIndex = lowerBound(myList, givenNumber);

        int c = myList[lowerBoundIndex - 1];
        System.out.println(c);

    }

    private static int lowerBound(int[] array, int target) {
        int low = 0;
        int high = array.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
