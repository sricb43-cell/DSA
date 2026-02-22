package DSA.twoDArray;

public class SearchInSorted2DMatrix {
    public boolean searchMatrix(int[][] arr, int target) {
        int m =arr.length;
        int n =arr[0].length;
        int i =0;
        int j =arr[0].length-1;
        while (i<m && j>=0)
        {
            if (arr[i][j]>target)j--;
            else if (arr[i][j]<target)i++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
