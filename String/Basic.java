package DSA.String;

import java.util.Scanner;

// char array
public class Basic {
    public static void main(String[] args) {
        char [] x ={'a','b','c'};
        for (int i:x)
        {
            System.out.print(i+" "); // return ascii values of all char
            System.out.println((char)i+" ");
        }
        //String s = "sri kant kumar";
       //Java ka ek class object hai String
        //Immutable (change nahi hota)
        //char[] Sirf characters ka array hai
        //Mutable (change ho sakta hai)

        // taking string as user input
        //Scanner sc =new Scanner(System.in);
       // System.out.println("enter your name :");
        //String a =sc.next(); // read input till space comes
       // System.out.println("enter your msg");
        //String b =sc.nextLine(); // read all String content as input

        // String methods and operation
        String s ="sri kant kumar";
        String t ="sri kumar";
        System.out.println(s.charAt(5));  // print char at specified position
        System.out.println(s.length());  // returns length of string(count space also)
        System.out.println(s.indexOf('k'));  // returns first occurence
        System.out.println(s.lastIndexOf('a')); // check occurence from last index
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith("sr"));
        System.out.println(s.endsWith("t"));
        System.out.println(s.contains("an"));
        System.out.println(s.compareTo(t));  // for equal return 0 for big +ve for small -ve but compare in lexographically order
//        s =s.concat(" "+t);
       // s =s+" "+t+10+'a';
       // s+="\n";
      //  s+='n';
      String  a ="sri"+10+20; // left to right concept
        // output sri1020; it is a string
        System.out.println(a);
        a =10+20+"sri";
        System.out.println(a);
        a =10+"sri"+20;
        System.out.println(a);
        a ='A'+45+"Sri";
        System.out.println(a);
        int m =10; // convert into string
//        String app ="";
//        app +=m;
        String app =Integer.toString(m);
        System.out.println(app);

    }

}
