package DSA.twoDArray;

public class forEachLoop {
    public static void main(String[] args) {
        int[][] arr ={{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,19,8,2,6}};
//        for (int i =0;i< arr.length;i++)
//        {
//            for (int j :arr[i])
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        for (int[] i:arr)
        {
            for (int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
