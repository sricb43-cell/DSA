package DSA.BinarySearch;

public class KthMissNoInSortArray {
    static int kthMissing(int[] a, int k) {
        int i =0;
        int j= a.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            int correctno =mid+1;
            int missing =a[mid]-correctno;
            if (missing>=k)j =mid-1;
            else i =mid+1;
        }
        return j +1+k;
    }
    public static void main(String[] args) {

    }

}
