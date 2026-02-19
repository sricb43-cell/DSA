package DSA.BinarySearch;
// leetcode problem
public class PeakIndex {
    public int peakIndexInMountainArray(int[] a) {
        int i =1;
        int j =a.length-2;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (a[mid]>a[mid-1] && a[mid]>a[mid+1])return mid;
            else if (a[mid]>a[mid-1] && a[mid]<a[mid+1]) {
                i =mid+1;
            }
            else j =mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
