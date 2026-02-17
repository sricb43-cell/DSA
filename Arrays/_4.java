package DSA.Arrays;

public class _4 {
    static int smaxx(int [] a)
    {
        int mx =Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        for (int i =0;i<a.length;i++)
        {
            if (a[i]>mx)mx =a[i];
        }
        for (int i =0;i<a.length;i++)
        {
            if (a[i]>smax && a[i]!=mx)smax =a[i];
        }
        return smax;
    }
    public static void main(String[] args) {
        int [] a ={-6,8,14,-2,23,47,4,3,10};
    }

}
