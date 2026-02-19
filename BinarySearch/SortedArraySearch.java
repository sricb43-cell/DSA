package DSA.BinarySearch;

public class SortedArraySearch {
    static boolean searchInSorted(int [] a, int target) {
        int i =0;
        int j =a.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (a[mid]==target)return true;
            else if (a[mid]>target) {
                j =mid-1;
            }
            else i =mid+1;
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
