package DSA.String;

public class InterningNew {
    public static void main(String[] args) {
        String s ="sri kant kumar";
        //s.charAt(0)='k';
        //s= s.substring(0,3)+'x'+s.substring(4);
        String sk ="sri kant kumar";
        String k =new String("sri kant kumar");
        System.out.println(sk==k); // compare if both object points same value
        System.out.println(sk.equals(k)); // compare all characters values(used this)

    }

}
