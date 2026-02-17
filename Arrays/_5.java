package DSA.Arrays;
// reverse an array
public class _5 {
    static void reverse(int [] a)
    {
        int i =0;
        int j =a.length-1;
        while (i<j)
        {
            int temp =a[i];
            a[i] =a[j];
            a[j] =temp;
            i++;
            j--;
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
        reverse(a);
        printArray(a);
    }

}
