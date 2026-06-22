package Recursion;

public class FuncationCallingItSelf {
    static void main() {
        print(1);
        System.out.println(10);
    }

    public static void print(int n){//1,2,3,4,5,6,7,8,9,10

        System.out.println(n);//1,2,3,4,5,6,7,8,9,10
        if(n==10) return;//-,-,-,-,-,-,-,-,-,return;
        print(n+1);//1+1,2+1,3+1,4+1,5+1,6+1,7+1,8+1,9+1
        System.out.println(n);//9,
    }
}
