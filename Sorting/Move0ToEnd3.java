package DSA.Sorting;

public class Move0ToEnd3 {
  static void pushZerosToEnd(int[] a) {
      int i =0;
      int j =0;
      while (i<a.length)
      {
          if (a[i]!=0)
          {
              int temp = a[i];
              a[i] = a[j];
              a[j] = temp;
              j++;
              i++;
          }
          else
          {
              i++;
          }
      }
      for (int m:a)
      {
          System.out.print(m+" ");
      }
    }
    public static void main(String[] args) {
        int [] a ={1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(a);
    }

}

