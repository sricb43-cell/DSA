package DSA.twoDArray;

public class reverseRowAndColumn {
    public static void main(String[] args) {
        int[][] arr = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};
        for (int i =0;i<arr.length;i++)
        {
            int j =0;
            int k =arr[0].length-1;
            while (j<k)
            {
                int temp =arr[i][j];
                arr[i][j] =arr[i][k];
                arr[i][k] =temp;
                j++;
                k--;
            }
        }
        for (int j =0;j<arr[0].length;j++)
        {
          int i =0;
          int k =arr.length-1;
          while (i<k)
          {
              int temp =arr[i][j];
              arr[i][j] =arr[k][j];
              arr[k][j] =temp;
              i++;
              k--;
          }
        }
        for (int i =0;i<arr.length;i++)
        {
            for (int j =0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}

