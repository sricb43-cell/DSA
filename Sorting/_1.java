package DSA.Sorting;
// check if array is sorted or not
public class _1 {
    static boolean isSorted(int[] a) {
        boolean sort =true;
        for (int i =0;i<a.length-1;i++)
        {
            if (a[i]>a[i+1])return false;
        }
        return sort;
    }
    public static void main(String[] args) {

    }

}
