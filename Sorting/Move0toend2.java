package DSA.Sorting;
//2nd method using arraylist
import java.util.ArrayList;

public class Move0toend2 {
    static  void pushZerosToEnd(int[] a) {
        int n =a.length;
        ArrayList<Integer> m = new ArrayList<>();
        int no_of0 =0;
        for (int i =0;i<n;i++)
        {
            if (a[i]!=0)m.add(a[i]);
            else no_of0++;
        }
        for (int i =0;i<no_of0;i++)
        {
            m.add(0);
        }
        for (int i =0;i<n;i++)
        {
            a[i] =m.get(i);
        }
        for (int i:a)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] a ={1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(a);
    }

}
