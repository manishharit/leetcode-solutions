package array;

import java.util.HashMap;

public class subarray_equals_sum_k_560 {
    public static void main(String[] args) {
        subarraySum(new int[]{1,2,3},3);
    }

        public static int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            int count = 0;
            int sum = 0;
            for(int i=0; i<nums.length; i++){
                sum += nums[i];
                int n = map.getOrDefault(sum-k, 0);
                count += n;

                map.put(sum, map.getOrDefault(sum,0)+1);
            }

            return count;
        }

}
