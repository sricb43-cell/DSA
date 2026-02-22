package DSA.twoDArray;

public class TransposeOfMatrixLeetocde {
    static void print(int a[][]) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr ={{1,6},{8,3},{9,2}};
        int row =arr[0].length;
        int column =arr.length;
        int [][] b =new int[row][column];
        for (int i =0;i<b.length;i++)
        {
            for (int j =0;j<b[0].length;j++)
            {
              b[i][j] =arr[j][i];
            }
        }
        print(b);

    }

}

