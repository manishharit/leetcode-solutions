package array_Easy;



public class remove_duplicates_from_sorted_array_28 {
    public static void main(String[] args) {removeDuplicates(new int[]{1,2,2,3,4,5,5,8});}

    private static int removeDuplicates(int[] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1])
                continue;
            nums[count] = nums[i];
            count++;
        }
        return count;
    }



}