package DSA.Sorting;

import java.util.Arrays;

public class twosum {
   static boolean twoSum(int a[], int target) {
       Arrays.sort(a);
       int i =0;
       int j =a.length-1;
      while (i<j)
      {
          if (a[i]+a[j]==target)return true;
          if (a[i]+a[j]>target)j--;
          if (a[i]+a[j]<target)i--;
      }
      return false;
   }
    public static void main(String[] args) {

    }

}
