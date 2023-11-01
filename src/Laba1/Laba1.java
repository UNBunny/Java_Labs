package Laba1;

import java.util.ArrayList;
import java.util.List;

public class Laba1 {
    private static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
    public static void var8(String text) { // В тексте найти все пары слов, из которых одно является обращением другого.

        List<String[]> pairs = new ArrayList<>();
        String[] words = text.replaceAll("[!\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]", " ").toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseWord(word);

            for (int j = i + 1; j < words.length; j++) {
                if (words[j].equals(reversedWord)) {
                    String[] pair = {word, words[j]};
                    pairs.add(pair);
                }
            }
        }

        for (String[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
