package DSA.String;

public class MostFrequent {
    static char getMaxOccuringChar(String s) {
        int max_count =0;
        char max_frq_char =s.charAt(0);
        for (int i =0;i<s.length();i++)
        {  int freq =1;
            char ch =s.charAt(i);
            for (int j =i+1;j<s.length();j++)
            {
                if (ch==s.charAt(j))
                {
                    freq++;
                }
            }
            if (freq>max_count)
            {
                max_count =freq;
                max_frq_char =ch;
            } else if (freq==max_count && ch<max_frq_char) {
                max_frq_char =ch;
            }
        }
        return max_frq_char;
    }
    public static void main(String[] args) {

    }

}
