package DSA.String;

public class ReverseSb {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("sri kant kumar");
        int i =0;
        int j =sb.length()-1;
        while (i<=j)
        {
            char tempa =sb.charAt(i);
            char tempb =sb.charAt(j);
            sb.setCharAt(i,tempb);
            sb.setCharAt(j,tempa);
            i++;
            j--;
        }
        sb.deleteCharAt(2);
        sb.delete(3,7);
        sb.insert(2,'m');
        System.out.println(sb);
    }

}
