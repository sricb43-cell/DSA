package DSA.BinarySearch;
// works on sorted search space
public class binarySearch {
    static int binarysearch(int []a,int target)
    {
        int i =0;
        int j =a.length-1;
        while (i<=j)
        {
            int mid =(i+j)/2;
            if (a[mid]==target)return mid;
            else if (a[mid]>target) {
                j =mid-1;
            }
            else i =mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
