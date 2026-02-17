package DSA.Arrays;
//Segregate 0s and 1
// 2 method
public class _10 {
    static void printArray(int [] a)
    {
        for (int i:a)
        {
            System.out.print(i+" ");
        }
    }
    static void segregate0and1(int[] a) {
       int i =0;
       int j =a.length-1;
       while (i<j)
       {
           if (a[i]==1 && a[j]==0)
           {
               int temp =a[i];
               a[i] =a[j];
               a[j] =temp;
               i++;
               j--;
           }
           if (a[i]==0)i++;
           if (a[j]==1)j--;
       }
    }
    public static void main(String[] args) {
        int [] a ={0,0,1,0,1,0,1,1,0};
        segregate0and1(a);
        printArray(a);
    }

}
