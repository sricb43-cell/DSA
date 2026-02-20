package DSA.String;

public class ChangeTheString {
    String modify(String s) {
        char ch =s.charAt(0);
        if(ch>='a' && ch<='z')
        {
            return s.toLowerCase();
        }
        else return s.toUpperCase();
    }
    public static void main(String[] args) {

    }

}
