package DSA.String;

public class NoOfVowels {
    static int Noofvowels(String s)
    {
        s =s.toLowerCase();
        int vowel =0;
        for (int i =0;i<s.length();i++)
        {
            if (s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='a')vowel++;
        }
        return vowel;
    }
    public static void main(String[] args) {
        String s ="sri kant kumar";
        System.out.println("no of vowel is :"+Noofvowels(s));
    }

}
