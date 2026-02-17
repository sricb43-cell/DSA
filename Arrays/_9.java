package DSA.Arrays;
//Segregate 0s and 1
// 1 method
public class _9 {
    static void segregate0and1(int[] a) {
        int n =a.length;
        int no0 =0;
        int no1 =0;
        for (int i:a)
        {
            if (i==0)no0++;
            else no1++;
        }
        int idx =0;
       for (int i =0;i<no0;i++)
       {
           a[idx] =0;
           idx++;
       }
      while (idx<n)
      {
          a[idx]=1;
          idx++;
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
        int [] a ={0,0,1,0,1,0,1,1,0};
        segregate0and1(a);
        printArray(a);
    }

}
