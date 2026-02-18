package DSA.Sorting;
// by finding largest element
public class SelectionSort2 {
    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int maxx = Integer.MIN_VALUE;
            int maxidx = -1;
            for (int j = 0; j < n-i; j++) {
                if (a[j] > maxx) {
                    maxx = a[j];
                    maxidx = j;
                }
            }
            int temp = a[n-1-i];
            a[n-1-i] = a[maxidx];
            a[maxidx] = temp;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int [] a ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(a);
    }
}
