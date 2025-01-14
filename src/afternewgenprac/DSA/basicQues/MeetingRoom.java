package afternewgenprac.DSA.basicQues;

import afternewgenprac.JobTries;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public static void main(String[] args) {
        int[][] meeting = {{1, 6}, {7, 8}, {10, 12}};
        minMeetingRooms(meeting);
    }

    public static void minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, new comparator());
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            int[] next = null;
            if (i + 1 < intervals.length) {
                next = intervals[i + 1];
            }
            if (next != null) {
                if (curr[1] > next[0]) {
                    System.out.println(false);
                    break;
                }
            }
        }

        System.out.println(true);

    }

    static class comparator implements Comparator<int[]> {

        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
        }
    }
}

