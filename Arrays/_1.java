package DSA.Arrays;
//maximum element in array
public class _1 {
    static int maxx(int [] a)
    {
        int mx =Integer.MIN_VALUE;
        for (int i =0;i<a.length;i++)
        {
            if (a[i]>mx)mx =a[i];
        }
        return mx;
    }
    public static void main(String[] args) {
        int [] a ={-6,8,14,-2,23,47,4,3,10};

    }

}
