package DSA.Recursion;

public class Basic {
    static void sri(int n)
    {
        if (n==0)return;
        System.out.println(n);
        sri(n-1); // function calling itself
    }
    public static void main(String[] args) {
        sri(5);
    }

}
