package DSA.BinarySearch;

public class ArrangingCoins2 {
    static int arrangeCoins(int n) {
        long i =0;
        long j =n;
        long ans =0;
        while (i<=j)
        {
           long m=i+(j-i)/2;
           long sqr =m*(m+1)/2;
           if (sqr==n)return (int)m;
          else if (sqr>n)
           {
               j=m-1;
           }
           else
           {
               ans =m;
               i =m+1;
           }
        }
        return (int)ans;
    }
    public static void main(String[] args) {

    }

}

