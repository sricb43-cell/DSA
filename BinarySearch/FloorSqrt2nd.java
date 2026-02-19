package DSA.BinarySearch;

public class FloorSqrt2nd {
    static int mySqrt(int n) {
        int i =0;
        int j =n;
        int idx =-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (mid*mid==n)return mid;
            else if (mid*mid<n) {
                idx =mid;
                i =mid+1;
            }
            else j =mid-1;
        }
        return idx;
    }
    public static void main(String[] args) {

    }

}

