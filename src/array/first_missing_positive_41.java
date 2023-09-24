package array;

public class first_missing_positive_41 {
    public static void main(String[] args) {
        firstMissingPositive(new int[]{3,4,-1,1});
    }

        public static int firstMissingPositive(int[] nums) {
            int i =0;
            while (i < nums.length){
                int value = nums[i] - 1;
                if(nums[i] <= nums.length && nums[i]>0 && nums[i] != nums[value]){
                    int temp = nums[i];
                    nums[i] = nums[value];
                    nums[value] = temp;
                }else {
                    i++;
                }
            }
            int count =0;
            for(int j=0; j< nums.length; j++){
                if(nums[j] != j+1){
                    return j+1;
                }
            }
            return nums.length+1;
        }
}
