package array_Easy;

import java.util.Arrays;

public class squares_of_sorted_array_977 {
    public static void main(String[] args) {
        sortedSquares1(new int[]{-4,-1,0,3,10});
        sortedSquares2(new int[]{-4,-1,0,3,10});
    }
    // optimal approach
    public static int[] sortedSquares1(int[] nums) {
        int data[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;
        while (left <= right) {
            int lsq = nums[left] * nums[left];
            int rsq = nums[right] * nums[right];
            if (lsq > rsq) {
                data[i] = lsq;
                left++;
            } else {
                data[i] = rsq;
                right--;
            }
            i--;
        }
        return data;
    }

    // approach with builtIn sort method
    public static int[] sortedSquares2(int[] nums){
        for(int i=0; i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }


    }
