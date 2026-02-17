package DSA.Arrays;
// wavy array
public class _11 {
    static void Wave(int a[]) {
        int n = a.length;
        if (n%2==0)
        {
            for (int i =0;i<n-1;i=i+2)
            {
                int temp =a[i];
                a[i] =a[i+1];
                a[i+1] =temp;
            }
        }
        if (n%2!=0)
        {
            for (int i =0;i<n-2;i=i+2)
            {
                int temp =a[i];
                a[i] =a[i+1];
                a[i+1] =temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] a ={1, 2, 3, 4, 5};
        int [] b ={2, 4, 7, 8, 9, 10};

    }

}

