package DSA.Recursion;

import java.util.Scanner;

public class NTo1And1ToN {
    static void both(int n)
    {
        if (n==0)return;
//        if (n==1)
//        {
//            System.out.print(n+" ");
//            return;
//        }
        System.out.print(n+" ");
        both(n-1);
        if (n!=1)System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter range :");
        int n =sc.nextInt();
        both(n);
    }

}
