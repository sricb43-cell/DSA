package DSA.String;
public class AllSubstrings {
    public static void main(String[] args) {
        String s ="abc";
        int n =s.length();
        for (int i =0;i<n;i++)
        {
            for (int j =i+1;j<n+1;j++)
            {
                System.out.println(s.substring(i,j));
            }
        }
    }

}
