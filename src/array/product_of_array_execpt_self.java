package array;

import java.util.Arrays;

public class product_of_array_execpt_self {


    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }
        public static int[] productExceptSelf(int[] nums) {
            int answer[] = new int[nums.length];
            Arrays.fill(answer,1);
            int current = 1;
            for(int i=0; i< nums.length; i++){
                answer[i] *= current;
                current *= nums[i];
            }
            current = 1;
            for(int i = nums.length-1; i>=0; i--){
                answer[i] *= current;
                current *= nums[i];
            }
            return answer;
        }

}
