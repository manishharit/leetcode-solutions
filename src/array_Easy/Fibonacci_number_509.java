package array_Easy;

public class Fibonacci_number_509 {
    public static void main(String[] args) {
        fib1(5);
        fib2(5);
        fib3(5);
    }
    // method 1
    public static int fib1(int n) {
        if( n==0 || n==1) return n;
        int a =0;
        int b =1;
        int c = a+b;
        for(int i=2; i<n; i++){
            a = b;
            b = c;
            c = a+b;
        }
        return c;
    }

    // method 2
        public static int fib2(int n) {
            if( n==0 || n==1) return n;
            int[] data = new int[n+1];
            data[0] = 0;
            data[1] = 1;
            for(int i=2; i<=n; i++){
                data[i] = data[i-1] + data[i-2];
            }
            return data[n];
    }

    // method 3
    public static int fib3(int n) {
        if( n==0 || n==1) return n;

        int fib1 = fib3(n-1);
        int fib2 = fib3(n-2);
        return fib1+fib2;
    }

}
