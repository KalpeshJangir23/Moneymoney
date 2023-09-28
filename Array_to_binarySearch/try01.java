package Array_to_binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class try01 {
    

   public static void main(String[] args) {
      List<String> list = Arrays.asList("Zara","Mahnaz","Ayan" );
      System.out.println("Source: " + list);

      for (int i = 0; i < list.size()-1; i++) {
        list.addAll(list);
      }

     System.out.println("Source: " + list);

   
   
}}
