package DSA.BinarySearch;

public class MaxBwNoPositiveNoNegative {
    static int maximumCount(int[] a) {
        int i =0;
        int j =a.length-1;
        int idx =-1;
        int NoOfNeg =0;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (a[mid]<0)
            {
                idx =mid;
                i =mid+1;
            } else if (a[mid]>=0) {
                j =mid-1;
            }
        }
        NoOfNeg =idx+1;
        i =0;
        j =a.length-1;
        idx =a.length;
        int noOfPositive =0;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
           if (a[mid]>0)
           {
               idx =mid;
               j =mid-1;
           }
           else i =mid+1;
        }
        noOfPositive =a.length-idx;
        return Math.max(noOfPositive,NoOfNeg);
    }
    public static void main(String[] args) {

    }

}

