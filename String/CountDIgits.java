package DSA.String;

public class CountDIgits {
    static int count(int n)
    {
        String m =Integer.toString(n);
        return m.length();
    }
    public static void main(String[] args) {
        double d =3.14;
        String s ="sri";
        s+=d;
        System.out.println(s);
        String a ="123456";
        int n =Integer.parseInt(a);
        System.out.println(n);
        String m ="sri kant kumar";
        //m.charAt(2)='x'; // not possible it is immutable
        System.out.println(s.substring(1,5)); // works for 1 to n-1
        char [] arr =m.toCharArray();
//       for (char i:arr)
//       {
//           System.out.println(i);
//       }
    }

}



// file name pascal case
// method camelcase
