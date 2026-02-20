package DSA.String;

public class SumOfAllSubstrings {
     static int sumSubstrings(String s) {
         int n =s.length();
         int sum =0;
         for (int i =0;i<n;i++)
         {
             for (int j =i+1;j<n+1;j++)
             {
                 String  sub =s.substring(i,j);
                 sum =sum+ Integer.parseInt(sub);
             }
         }
         return sum;
    }
    public static void main(String[] args) {

    }

}
