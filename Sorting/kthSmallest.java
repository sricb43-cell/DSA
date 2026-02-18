package DSA.Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class kthSmallest{
    public int kSmallest(int[] a, int k) {
        Arrays.sort(a);
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (b.isEmpty() || b.get(b.size() - 1) != a[i]) {
                b.add(a[i]);
            }
        }

        return b.get(k - 1);
    }
    public static void main(String[] args) {

    }
}


