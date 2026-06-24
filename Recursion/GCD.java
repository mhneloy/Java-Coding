package Recursion;

public class GCD {
    static void main() {
        int a =  60;
        int b = 24;


        System.out.println(gcd(a,b));;
    }
//    public static int gcd(int a, int b){
//        int gcd = 1;
//        int n =  (a < b) ? a: b;
//        for(int i=1; i<n; i++){
//            if(a%i==0 && b%i==0 ) {
//                gcd = (gcd < i) ? i : gcd;
//            }
//        }
//        return gcd;
//    }

    public static int gcd(int a, int b){
        if(b%a == 0) return a;
        return  gcd(b%a,a);
    }
}
