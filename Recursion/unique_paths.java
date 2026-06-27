package Recursion;

import java.util.Scanner;

public class unique_paths {
//    public static int paths(int m,int n){
//        if(m==1 || n == 1) return 1;
//        return paths(m-1,n) + paths(m, n-1);
//    }

    public static int paths(int cr, int cc){
        if(cr==1 && cc ==1) return 1;
        if(cr == 0 || cc == 0) return 0;
        int right = paths(cr, cc-1);
        int down = paths(cr-1, cc);
        return right + down;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of row & column so that you can see how many ways are there to move [0,0] to [m-1,n-1]:\n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(paths(m,n));
    }
}
