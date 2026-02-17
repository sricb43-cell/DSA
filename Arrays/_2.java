package DSA.Arrays;
// minimum in array
public class _2 {
    static int minn(int [] a)
    {
        int mn =Integer.MAX_VALUE;
        for (int i =0;i<a.length;i++)
        {
            if (a[i]>mn)mn =a[i];
        }
        return mn;
    }

    public static void main(String[] args)
    {
        int [] a ={-6,8,14,-2,23,47,4,3,10};
    }
}
