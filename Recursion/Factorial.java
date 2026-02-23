package DSA.Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n)
    {
       return  (n<=1)?1:factorial(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter no :");
        int n =sc.nextInt();
    }

}
