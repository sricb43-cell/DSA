package DSA.String;

public class CompareFunction {
    static int cmpto(String a, String b)
    {
        int minn =Math.min(a.length(),b.length());
        {
            for (int i =0;i<minn;i++)
            {
                if (a.charAt(i)!=b.charAt(i))
                {
                    return a.charAt(i)-b.charAt(i);
                }
            }
            return a.length()-b.length();
        }
    }
    public static void main(String[] args) {
        String a ="sri";
        String b ="sr";
        System.out.println(cmpto(a,b));
    }

}
