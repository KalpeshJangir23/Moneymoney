package greedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class nmeetinginOneRoom {
    /**
     * meeting
     */
    static class Meeting {
        int start;
        int end;
        int index;

        public Meeting(int start, int end, int index) {
            this.start = start;
            this.end = end;
            this.index = index;
        }

    }

    public static int maxMeetings(int start[], int end[], int n) {
        Comparator<Meeting> com = new Comparator<Meeting>() {
            public int compare(Meeting o1, Meeting o2) {
                if (o1.end < o2.end) {
                    return -1;
                } else if (o1.end > o2.end) {
                    return 1;
                } else if (o1.index < o2.index) {
                    return -1;
                }
                return 1;
            }
        };
        List<Meeting> meet = new ArrayList<>();
        for (int i = 0; i < end.length; i++) {
            meet.add(new Meeting(start[i], end[i], i + 1));
        }
        Collections.sort(meet, com);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).index);
        int limit = meet.get(0).end;

        for (int i = 1; i < start.length; i++) {
            if (meet.get(i).start > limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).index);
            }
        }
        
        return answer.size();
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int N = 8;
        int[] end = { 2, 4, 6, 7, 9, 9 };
        System.out.println(maxMeetings(start, end, N));
    }
}

// int count = 1;
// Arrays.sort(start);
// Arrays.sort(end);
// int s = start[0];
// int e = end[0];
// for (int i = 1; i < end.length; i++) {
// if (s < start[i] && e < start[i]) {
// count++;
// s = start[i];
// e = end[i];
// }
// }
// return count;
// issue is ki meeting ka sequence change ho raha sort ke baad i meet start and
// end same nahi hai
// iss liye apne ko end ke according sort karna padega and store karna padega