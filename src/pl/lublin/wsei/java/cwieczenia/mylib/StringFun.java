package pl.lublin.wsei.java.cwieczenia.mylib;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class StringFun {
    public static  boolean isPalindrome(String word) {
        String cleanedTekst = word.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        int length = cleanedTekst.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedTekst.charAt(i) != cleanedTekst.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
        }

    public static String anarchize(String text) {
        StringBuilder result = new StringBuilder();
        boolean upperCase = Character.isUpperCase(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (upperCase) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                upperCase = !upperCase;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static String camelize(String text) {
        String[] words = StringUtils.split(text);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                result.append(StringUtils.uncapitalize(word));
            } else {
                result.append(StringUtils.capitalize(word));
            }
        }

        return result.toString();
    }
    public static String decamelize(String tekst) {
        if (tekst == null || tekst.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char prevChar = tekst.charAt(0);
        sb.append(prevChar);

        for (int i = 1; i < tekst.length(); i++) {
            char currChar = tekst.charAt(i);
            if (Character.isUpperCase(currChar)) {
                sb.append(' ').append(Character.toLowerCase(currChar));
            } else {
                sb.append(currChar);
            }
            prevChar = currChar;
        }

        return StringUtils.strip(sb.toString(), " ");
    }
    public static String shuffle(String text) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(text);
        int len = text.length();
        for (int i = 0; i < len; i++) {
            int randIndex = rand.nextInt(len - i);
            char c = sb.charAt(randIndex);
            sb.deleteCharAt(randIndex);
            sb.insert(len - 1 - i, c);
        }
        return sb.toString();
    }
}
