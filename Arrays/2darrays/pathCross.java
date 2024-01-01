import java.util.ArrayList;
import java.util.List;

public class pathCross {
    public static boolean isPathCrossing(String path) {
            List<List<Integer>> itemCheck = new ArrayList<>();
            List<Integer> item = new ArrayList<>();
            int x = 0, y = 0;

            for (int i = 0; i < path.length(); i++) {
                if (path.charAt(i) == 'N') {
                    y = y + 1;
                    item.add(x);
                    item.add(y);
                    if (itemCheck.contains(item)) {
                        return true;
                    }
                    itemCheck.add(new ArrayList<>(item));
                } else if (path.charAt(i) == 'S') {
                    y = y - 1;
                    item.add(x);
                    item.add(y);
                    if (itemCheck.contains(item)) {
                        return true;
                    }
                    itemCheck.add(new ArrayList<>(item));
                } else if (path.charAt(i) == 'E') {
                    x = x + 1;
                    item.add(x);
                    item.add(y);
                    if (itemCheck.contains(item)) {
                        return true;
                    }
                    itemCheck.add(new ArrayList<>(item));
                } else {
                    x = x - 1;
                    item.add(x);
                    item.add(y);
                    if (itemCheck.contains(item)) {
                        return true;
                    }
                    itemCheck.add(new ArrayList<>(item));
                }
            }
            return false;
    }

    public static void main(String[] args) {
        String path = "NES";
        System.out.println(isPathCrossing(path)); // Output should be false
    }
}
