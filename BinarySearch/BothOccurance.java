package DSA.BinarySearch;
// gfg practice
import java.util.ArrayList;

public class BothOccurance {
  static ArrayList<Integer> find(int a[], int target) {
      ArrayList<Integer> x = new ArrayList<>();
      int i =0;
      int j =a.length-1;
      int fidx =-1;
      int lidx =-1;
      while (i<=j)
      {
          int mid =i+(j-i)/2;
          if (a[mid]==target)
          {
              fidx =mid;
              j =fidx-1;
          }
          else if (a[mid]<target) {
              i =mid+1;
          }
          else j =mid-1;
      }
      x.add(fidx);
      i =0;
      j =a.length-1;
      while (i<=j)
      {
          int mid =i+(j-i)/2;
          if (a[mid]==target)
          {
              lidx =mid;
              i =lidx+1;
          }
          else if (a[mid]<target) {
              i =mid+1;
          }
          else j =mid-1;
      }
      x.add(lidx);
      return x;
    }
    public static void main(String[] args) {

    }

}
