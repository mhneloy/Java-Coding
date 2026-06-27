package Recursion;

public class RecursionOnArrays {
    static void main() {
        int[] arr = {5,3,7,12,76, 9, 34, 6};//8
        recPrint(arr,0);
        int target = 60;
        System.out.println(exists(arr,target,0));
    }
    public static void recPrint(int[] arr, int idx){
        if(arr.length == idx) return;
        System.out.println(arr[idx]);
        recPrint(arr,idx+1);
    }
    public  static boolean exists(int[] arr,int target, int idx){
        int len = arr.length;
        if(len == idx) return false;
        if(arr[idx] == target) return true;
        return exists(arr,target,idx+1);
    }
}
