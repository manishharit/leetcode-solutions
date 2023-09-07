package array_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15},9);
        }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> data = new HashMap<>();

        for(int i=0; i< nums.length;i++){
            int value = target - nums[i];
            if(data.containsKey(value)){
                return new int[]{data.get(value),i};
            }else {
                data.put(nums[i],i);
            }
        }
        return null;

    }

}