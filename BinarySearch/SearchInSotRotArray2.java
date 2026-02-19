package DSA.BinarySearch;

public class SearchInSotRotArray2 {
    int search(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <j) {
            int mid = i + (j - i) / 2;

            if (a[mid] > a[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        int pvtIdx = i;
        if (target >= a[pvtIdx] && target <= a[a.length - 1]) {
            i = pvtIdx;
            j = a.length - 1;
        } else {
            i = 0;
            j = pvtIdx - 1;
        }
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (a[mid] == target) return mid;
            else if (a[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {

    }

}
