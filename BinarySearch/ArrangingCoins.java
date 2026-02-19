package DSA.BinarySearch;

public class ArrangingCoins {
    static int mySqrt(long n) {
        long i = 0;
        long j = n;
        while (i <= j) {
            long mid = i + (j - i) / 2;
            if (mid * mid == n) return (int)mid;
            else if (mid * mid > n) {
                j = mid - 1;
            } else i = mid + 1;
        }
        return (int)j;
    }
    static int arrangeCoins(int x) {
        long m =8*x+1;
        return (int)(mySqrt(m)-1)/2;
    }
    public static void main(String[] args) {

    }

}
