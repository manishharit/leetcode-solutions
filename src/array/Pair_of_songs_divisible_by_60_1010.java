package array;

import java.util.HashMap;

public class Pair_of_songs_divisible_by_60_1010 {
    public static void main(String[] args) {
        numPairsDivisibleBy60(new int[]{30,20,150,100,40});
    }

        public static int numPairsDivisibleBy60(int[] time) {
           int count =0;
           for(int i=0; i<time.length; i++){
               if(time[i]>=60) time[i] %= 60;
           }
           HashMap<Integer,Integer> data = new HashMap<>();
           for(int i=0; i< time.length; i++){
               if(time[i] ==0 && data.containsKey(time[i])){
                   count += data.get(time[i]);
               }
               if (data.containsKey(60-time[i])){
                   count += data.get(60-time[i]);
               }
               data.put(time[i],data.getOrDefault(time[i],0)+1);
           }
           return count;
        }

}
