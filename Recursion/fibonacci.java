package Recursion;

public class fibonacci {
    static void main() {
        System.out.println(fibo(6));
    }

    public static int fibo(int n){
        if(n==0 ||n==1){
            return n;
        }
        int result = fibo(n-1) + fibo(n-2);
        return result;

    }
}
