package Recursion;

public class nth_stairs {

    public static int stairWays(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return stairWays(n-1) + stairWays(n-2);
    }

    static void main() {
        System.out.println(stairWays(4));
    }
}
