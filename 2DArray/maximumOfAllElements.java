package DSA.twoDArray;

public class maximumOfAllElements {
    public static void main(String[] args) {
        int [][] arr ={{11,23,21},{34,54,39}};
        int maxx =Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++)
        {
            for (int j =0;j<arr[0].length;j++)
            {
                if (arr[i][j]>maxx)maxx =arr[i][j];
            }
        }
        System.out.println("maximum is :"+maxx);
    }

}
