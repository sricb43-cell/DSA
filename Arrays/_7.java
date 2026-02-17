package DSA.Arrays;
// rotate array by left
// second method
public class _7 {
    static void reverse(int [] a,int i,int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    static void left(int [] a,int d)
    {
        int n =a.length;
        d =d%n;
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
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
        left(a,36);
        printArray(a);
    }
}
