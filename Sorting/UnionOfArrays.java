package DSA.Sorting;
import java.util.ArrayList;
import java.util.Arrays;
public class UnionOfArrays {
     static ArrayList<Integer> findUnion(int a[], int b[]) {
         ArrayList<Integer> m = new ArrayList<>();
         int i = 0;
         int j = 0;

         while (i < a.length && j < b.length) {

             if (a[i] == b[j]) {
                 if (m.isEmpty() || m.get(m.size() - 1) != a[i]) {
                     m.add(a[i]);
                 }
                 i++;
                 j++;
             }

             else if (a[i] < b[j]) {
                 if (m.isEmpty() || m.get(m.size() - 1) != a[i]) {
                     m.add(a[i]);
                 }
                 i++;
             }

             else {
                 if (m.isEmpty() || m.get(m.size() - 1) != b[j]) {
                     m.add(b[j]);
                 }
                 j++;
             }
         }

         while (i < a.length) {
             if (m.isEmpty() || m.get(m.size() - 1) != a[i]) {
                 m.add(a[i]);
             }
             i++;
         }

         while (j < b.length) {
             if (m.isEmpty() || m.get(m.size() - 1) != b[j]) {
                 m.add(b[j]);
             }
             j++;
         }

         return m;

    }
    public static void main(String[] args) {

    }

}

