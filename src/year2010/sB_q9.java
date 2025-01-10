package year2010;

import java.util.*;

public class sB_q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine().toUpperCase();

        int[] freq = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                freq[ch - 'A']++;
            }
        }

        System.out.println("Character\tFrequency\tCharacter\tFrequency");

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.print((char) (i + 'A') + "\t    \t" + freq[i] + "\t    \t");
                count++;

                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }

        in.close();
    }
}
