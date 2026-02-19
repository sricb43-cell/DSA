package DSA.BinarySearch;

public class SearchInSotRotArray {
    int search(int[] a, int target) {
        int i =0;
        int j =a.length-1;
        while (i<=j)
        {
            int mid =i+(j-i)/2;
            if (a[mid]==target)return mid;
            else if (a[i]<=a[mid]) {
                if (a[i]<=target && target<a[mid])j =mid-1;
                else i =mid+1;
            }
            else
            {
                if (a[mid]<target && target<=a[j])i =mid+1;
                else j =mid-1;
            }
        }
        return -1;
        }
    public static void main(String[] args) {


    }

}




