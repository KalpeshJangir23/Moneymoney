package DP.Recursion.goodQuestion;

public class linearSearch {
    static int find_target(int[] arr , int target , int index){
        if (index >= arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return find_target(arr, target, index+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,5, 10 ,52, 100};
        int target = -52;
        System.out.println(find_target(arr, target, 0));
    }
}
