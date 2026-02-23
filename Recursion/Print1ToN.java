package DSA.Recursion;

import java.util.Scanner;

public class Print1ToN {
    static void oneToN(int n)
    {
        if (n==0)return;
        oneToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter range :");
        int n =sc.nextInt();
        oneToN(n);
    }

}
