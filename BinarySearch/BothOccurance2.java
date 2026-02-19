package DSA.BinarySearch;
// leetcode practice
public class BothOccurance2 {
    public int[] searchRange(int[] a, int target) {
        int[] x = new int[2];
        int i = 0;
        int j = a.length - 1;
        int fidx = -1;
        int lidx = -1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (a[mid] == target) {
                fidx = mid;
                j = fidx - 1;
            } else if (a[mid] < target) {
                i = mid + 1;
            } else j = mid - 1;
        }
        x[0] = fidx;
        i = 0;
        j = a.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (a[mid] == target) {
                lidx = mid;
                i = lidx + 1;
            } else if (a[mid] < target) {
                i = mid + 1;
            } else j = mid - 1;
        }
        x[1] = lidx;
        return x;
    }
    public static void main(String[] args) {

    }

}
