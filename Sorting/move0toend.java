package DSA.Sorting;
// by bubble sort
public class move0toend {
    static  void pushZerosToEnd(int[] a) {
        int n = a.length;
        for (int i =0;i<n-1;i++)
        {
            for (int j=0;j<n-1-i;j++)
            {
                if (a[j]==0)
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
    int [] a ={1, 2, 0, 4, 3, 0, 5, 0};
    pushZerosToEnd(a);
    }

}
