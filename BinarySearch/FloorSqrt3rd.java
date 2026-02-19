package DSA.BinarySearch;

public class FloorSqrt3rd {
    static int mySqrt(int n) {
        int i = 0;
        int j = n;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (mid * mid == n) return mid;
            else if (mid * mid >n) {
                j = mid-1;
            } else i = mid + 1;
        }
        return j;
    }
    public static void main(String[] args) {

    }


}
