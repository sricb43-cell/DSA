package DSA.String;
public class stringBuilder {
    public static void main(String[] args) {
       StringBuilder sb =new StringBuilder(6);
        System.out.println(sb.capacity()+" "+sb.length());  // defualt 16 capacity lenght 0
        sb.append("sri kant kumar");
        System.out.println(sb.capacity()+" "+sb.length());
        sb.setCharAt(3,'o');
        System.out.println(sb);
        String t =sb.toString();
        System.out.println(t);
    }

}

