package BinarySearch;

public class BinarySearch {

    static boolean binarySearch(int[] a, int target) {
        int n = a.length;
        int st = 0, end = n - 1; // o based indexing
        while ((st <= end)) {
            int mid = (st + end) / 2;
            if (target == a[mid]) {
                return true;
            } else if (target < a[mid]) {
                end = mid;
                mid = (st + end) / 2;
            }
        }
        return true;
    };


     static void main () {
        int[] a = {1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(binarySearch(a, target));
    }

/*
* this code is not fully correct. Please correct the code before running or if you want to find the correct answer.
* */
}
