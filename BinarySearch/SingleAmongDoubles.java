package DSA.BinarySearch;

public class SingleAmongDoubles {
   static int single(int[] a) {
       int n=a.length;
       int i =0;
       int j =a.length-1;
       if (a.length==1)return a[0];
       if (a[0]!=a[1])return a[0];
       if (a[n-1]!=a[n-2])return a[n-1];
       while (i<=j)
       {
           int mid =i+(j-i)/2;
           if (a[mid]!=a[mid+1] && a[mid]!=a[mid-1])return a[mid];
           int f =mid ;
           int s =mid;
           if (a[mid-1]==a[mid])f=mid-1;
           else s =mid+1;
           int left_distance =f-i;
           int right_distance =j-s;
           if (left_distance%2==0)i =s+1;
           else j =f-1;
       }
       return -1;
    }
    public static void main(String[] args) {

    }

}
