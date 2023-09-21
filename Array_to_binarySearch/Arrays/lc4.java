import java.util.ArrayList;
import java.util.Collections;

class lc4 {
   
        
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            ArrayList<Integer> al = new ArrayList<Integer>();
    
            for (int i= 0 , j = 0 ; j<nums2.length && i < nums1.length; i++ , j++) {
                al.add(nums1[i]);
                al.add(nums2[j]);
            }
            
            Collections.sort(al);
            int n = al.size();
            double[] result = new double[n];
            for (int i = 0; i < n; i++) {
                result[i] = al.get(i);
            }
            double median = 0.0;
    
            if (n % 2 == 0) {
                median = (result[n/2 - 1] + result[n/2]) / 2.0;
            } else {
                median = result[n/2];
            }
    
            return median;
        }
        public static void main(String[] args) {
            int[] nums1 = {1,3};
            int[] nums2 = {2};
            System.out.println(findMedianSortedArrays(nums1, nums2));
        }

}
