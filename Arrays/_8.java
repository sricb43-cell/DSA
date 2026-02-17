package DSA.Arrays;

public class _8 {
    int missing(int [] a)
    {
        int n =a.length+1;
        int sum =n*(n+1)/2;
        int arrSum =0;
        for (int i =0;i<a.length;i++)
        {
            arrSum+=a[i];
        }
        return sum-arrSum;
    }
    public static void main(String[] args) {

    }

}
