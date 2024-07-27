package arrays;

import java.util.*;

public class HighAccessEmployee {

  public List<String> findHighAccessEmployees(List<List<String>> access_times) {
    List<String> res = new ArrayList<>();
    HashMap<String, List<String>> hmap = new HashMap<>();
    for (int i = 0; i < access_times.size(); i++) { // ! hash map created
      String name = access_times.get(i).get(0);
      String time = access_times.get(i).get(1);
      if (hmap.containsKey(name)) {
        hmap.get(name).add(time);
      } else {
        List<String> times = new ArrayList<>();
        times.add(time);
        hmap.put(name, times);
      }
    }

    for (Map.Entry<String, List<String>> entry : hmap.entrySet()) {
      List<String> val = entry.getValue();
      if (val.size() >= 3) {
        val.sort(Comparator.comparingInt(Integer::parseInt));

        int i = 0;
        int j = 2;
        boolean found = false;
        while (!found && j < val.size()) {
          int[] time1 = parseTime(val.get(i));
          int[] time2 = parseTime(val.get(j));
          int minutes1 = time1[0] * 60 + time1[1];
          int minutes2 = time2[0] * 60 + time2[1];
          int difference = Math.abs(minutes2 - minutes1);
          if (difference <= 59) {
            found = true;
            res.add(entry.getKey());
            break;
          } else {
            i++;
            j++;
          }
        }
      }
    }

    return res;
  }

  private static int[] parseTime(String timeString) {
    int hours = Integer.parseInt(timeString.substring(0, 2));
    int minutes = Integer.parseInt(timeString.substring(2, 4));
    return new int[] { hours, minutes };
  }
}
