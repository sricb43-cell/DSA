package DSA.BinarySearch;

public class LastOccurance {
    static int lastOccur(int [] a ,int target) {
        int i = 0;
        int j = a.length - 1;
        int idx = -1;
        while (i <= j) {
            //int mid = (i + j) / 2;
            int mid =i+(j-i)/2;
            if (a[mid] == target) {
                idx = mid;
              i =idx+1;
            } else if (a[mid] < target) {
                i = mid + 1;
            } else j = mid - 1;
        }
        return idx;
    }
    public static void main(String[] args) {

    }

}

