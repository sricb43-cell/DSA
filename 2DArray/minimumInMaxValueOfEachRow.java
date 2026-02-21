package DSA.twoDArray;

public class minimumInMaxValueOfEachRow {
    public static void main(String[] args) {
        int[][] arr ={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,19,8,2,6}};
        int minn =Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            int maxx =Integer.MIN_VALUE;
            for (int j =0;j<arr[0].length;j++)
            {
                if (arr[i][j]>maxx)
                {
                    maxx =arr[i][j];
                }
            }
            if (minn>maxx)
            {
                minn =maxx;
            }
        }
        System.out.println(minn);
    }

}
