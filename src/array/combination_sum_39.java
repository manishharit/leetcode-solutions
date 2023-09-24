package array;

import java.util.ArrayList;
import java.util.List;

public class combination_sum_39 {


    public static void main(String[] args) {
        combinationSum(new int[]{2,3,6,7},5);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        trackMe(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private static void trackMe(List<List<Integer>> list, List<Integer> tempList, int[] nums, int target, int start){
        if(target < 0) return;
        else if(target == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i< nums.length; i++){
                tempList.add(nums[i]);
                trackMe(list, tempList, nums, target-nums[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
