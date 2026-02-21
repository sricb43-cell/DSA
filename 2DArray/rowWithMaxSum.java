package DSA.twoDArray;

public class rowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr ={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,19,8,2,6}};
        int maxx_row =-1;
        int maxx_sum =Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            int sum =0;
            for (int j =0;j<arr[0].length;j++)
            {
                sum+=arr[i][j];
            }
            if (sum>maxx_sum)
            {
                maxx_sum =sum;
                maxx_row =i;
            }
        }
        System.out.println("maximum row is :"+maxx_row);
    }

}
