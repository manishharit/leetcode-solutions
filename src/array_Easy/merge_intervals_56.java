package array_Easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class merge_intervals_56 {
    public static void main(String[] args) {
        merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
    }

    public static int[][] merge(int[][] intervals) {
           if(intervals.length <=1){
               return  intervals;
           }
           // sorting
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
        }

}
