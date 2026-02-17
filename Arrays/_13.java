package DSA.Arrays;
// merge two sorted arrays
public class _13 {
    static void merge(int [] a, int [] b, int [] c)
    {
        int i =0;
        int j =0;
        int k =0;
        while (i<a.length && j<b.length)
        {
            if (a[i]<b[j])
            {
                c[k] =a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }

        }
        while (i<a.length)
        {
            c[k] =a[i];
            k++;
            i++;
        }
        while (j<b.length)
        {
            c[k] =b[j];
            k++;
            j++;
        }
        for (int n:c)
        {
            System.out.print(n + " ");
        }

    }
    public static void main(String[] args) {
        int [] a ={2,5,6,9,20};
        int [] b ={1,3,4,5,7,8};
        int [] c =new int[a.length+b.length];
        merge(a,b,c);
    }

}
