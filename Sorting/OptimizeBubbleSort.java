package DSA.Sorting;
// 3 ways to check if arrays is already sorted then no need for more checks
public class OptimizeBubbleSort {
    static void bubblesort(int [] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
//            boolean isSort =true;
//            for (int j =0;j<n-1;j++)
//            {
//                if (a[j]>a[j+1])
//                {
//                    isSort =false;
//                    break;
//                }
//            }
//            if (isSort==true)break;
            int noSwap =0;
            //boolean issorted =true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    noSwap++;
                   // issorted =false;
                }
            }
            if (noSwap==0)break;
           // if (issorted==true)break;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int [] a ={-4,-3,5,9,10,12};
        bubblesort(a);
    }
}
