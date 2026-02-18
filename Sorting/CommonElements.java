package DSA.Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
     static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> m = new ArrayList<>();
         Arrays.sort(a);
         Arrays.sort(b);
         int i =0;
         int j =0;
         while (i<a.length && j<b.length)
         {
             if (a[i]==b[j])
             {
                 m.add(a[i]);
                 i++;
                 j++;
             }
             else if (a[i]>b[j])
             {
                 j++;
             }
             else i++;
         }
        return m;

    }

    public static void main(String[] args) {

    }

}
