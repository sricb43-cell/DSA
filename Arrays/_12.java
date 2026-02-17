package DSA.Arrays;
import java.util.Collections;
import java.util.Vector;

public class _12 {
    Vector<Integer> addOne(int[] a) {
        int n =a.length;
        Vector<Integer> v = new Vector<>();
        int carry =1;
        for (int i =n-1;i>=0;i--)
        {
            if (a[i]+carry<9)
            {
                v.add(a[i]+1);
                carry =0;
            }
            if (a[i]+carry>9)
            {
                v.add(0);
                carry =1;
            }
        }
        if (carry==1)v.add(1);
        Collections.reverse(v);
        return v;
    }
    public static void main(String[] args) {

    }

}
