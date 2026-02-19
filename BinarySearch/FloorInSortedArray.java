package DSA.BinarySearch;

public class FloorInSortedArray {
    public int findFloor(int[] a, int x) {
        int i =0;
        int j =a.length-1;
        int idx =-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (a[mid]>x)
            {
                j =mid-1;
            }
            else
            {
                idx =mid;
                i =mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {

    }

}
