package DSA.BinarySearch;

public class FloorSqrt {
    static int mySqrt(int x) {
        int root =0;
        for (int i =1;i<=x;i++)
        {
            if (i*i>x)break;
            root =i;
        }
        return root;
    }
    public static void main(String[] args) {

    }

}
