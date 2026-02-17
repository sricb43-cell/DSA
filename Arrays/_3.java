package DSA.Arrays;
// search in array
public class _3 {
    static int search(int[] a,int target)
    {
        for (int i =0;i<a.length;i++)
        {
            if (a[i]==target)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] a ={-6,8,14,-2,23,47,4,3,10};
    }

}
