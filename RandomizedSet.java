 import java.util.*;
 public class RandomizedSet {
    HashSet<Integer> set  = new HashSet<>();
    public RandomizedSet() {
       //HashSet<Integer> set  = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        }
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return getRandomElement(set);
    }
    private static <T> T getRandomElement(HashSet<T> set) {
        // Convert HashSet to an array
        T[] array = (T[]) set.toArray();

        // Generate a random index
        int randomIndex = new Random().nextInt(array.length);

        // Return the random element
        return array[randomIndex];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */