package DSA.Sorting;
// by finding smallest element
public class SelectionSort {
   static void selectionSort(int[] a) {
        int n =a.length;
        for (int i =0;i<n-1;i++)
        {
            int min =Integer.MAX_VALUE;
            int minidx =-1;
            for (int j =i;j<n;j++)
            {
                if (a[j]<min)
                {
                    min =a[j];
                    minidx =j;
                }
            }
            int temp = a[i];
            a[i] = a[minidx];
            a[minidx] = temp;
        }
        for (int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] a ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(a);
    }

}
