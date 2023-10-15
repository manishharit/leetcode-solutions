package array;

public class climb_stairs {
    public static void main(String[] args) {
        climbStairs( 5);
    }
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 2;
        for(int i=2; i<n; i++){
            result[i] = result[i-1] + result[i-2];
        }
        return result[n - 1];
    }
}