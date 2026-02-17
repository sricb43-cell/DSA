package DSA.Arrays;
// rotate array by left
// first method
public class _6 {
    static void left(int [] a,int d)
    {
        int n =a.length;
        int [] b =new int[n];
        int idx =0;
        for (int i =d;i<n;i++)
        {
            b[idx] =a[i];
            idx++;
        }
       for (int i =0;i<d;i++)
       {
           b[idx] =a[i];
           idx++;
       }
        for (int i=0;i<n;i++)
        {
            a[i] =b[i];
        }
    }
    static void printArray(int [] a)
    {
        for (int i:a)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int [] a ={-6,8,14,-2,23,47,4,3,10};
        left(a,4);
        printArray(a);
    }

}
