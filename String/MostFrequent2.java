package DSA.String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MostFrequent2 {
    static char getMaxOccuringChar(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        int freq = -1;
        char max_frq_char = s.charAt(0);
        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                int len = j - i;
                if (len > freq) {
                    freq = len;
                    max_frq_char = arr[i];
                }
                i = j;
            }
        }
        int len = j - i;
        if (len > freq) {
            freq = len;
            max_frq_char = arr[i];
        }
        return max_frq_char;
    }
    public static void main(String[] args) {

    }

}
