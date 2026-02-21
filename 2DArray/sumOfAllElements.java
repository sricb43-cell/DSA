package DSA.twoDArray;

public class sumOfAllElements {
    public static void main(String[] args) {
        int sum =0;
        int [][] arr ={{11,23,21},{34,54,39}};
        for (int i =0;i<arr.length;i++)
        {
            for (int j =0;j<arr[0].length;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }

}
