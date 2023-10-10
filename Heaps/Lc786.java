package Heaps;

import java.util.*;

public class Lc786 {
    public static int[] double_and_arr(int[] arr, int k) {

        Map<Double, int[]> tmap = new TreeMap<>();
        int i = 0;
        int j = 1;

        while (i < arr.length - 1 && i < j) {
            double d = (double) arr[i] / arr[j];
            int[] val = { arr[i], arr[j] };
            tmap.put(d, val);
            i++;
            j++;
        }

        System.out.println(tmap);

        int[] kthValue = null;
        int count = 0;
        Iterator<Map.Entry<Double, int[]>> iterator = tmap.entrySet().iterator();

    
        while (iterator.hasNext()) {
            Map.Entry<Double, int[]> entry = iterator.next();


            if (count == k) {
                kthValue = entry.getValue();
                System.out.println(entry.getValue());
                break;
            }
            count++;
        }
        return kthValue;
        
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int k = 3;
        int[] result = double_and_arr(arr, k);

        if (result != null) {
            System.out.println( result[0] + " " + result[1]);
        } else {
            System.out.println("No result found.");
        }
    }
}
