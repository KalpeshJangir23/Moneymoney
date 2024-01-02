package Basic;

import java.util.*;
public class setinjava {
    public static void main(String[] args) {
        // Creating sets
        List<Integer> set1 = new ArrayList<>();
        set1.add(0);
        set1.add(1);
        set1.add(-1);

        List<Integer> set2 = new ArrayList<>();
        set2.add(0);
        set2.add(1);
        set2.add(-1);

        List<Integer> set3 = new ArrayList<>();
        set3.add(-1);
        set3.add(-1);
        set3.add(2);

        // Creating a set of sets
        Set<Set<Integer>> setOfSets = new HashSet<>();
        

         Set<Integer> mySet = new HashSet<>();

        // Add all elements from the list to the set
        mySet.addAll(set1);
       // setOfSets.add(mySet);
        mySet.addAll(set2);
        //setOfSets.add(mySet);
        mySet.addAll(set3);
        setOfSets.add(mySet);

        System.out.println(setOfSets);

    }
}
