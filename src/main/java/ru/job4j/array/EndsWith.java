package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int delta = word.length - post.length;
        for (int i = delta; i < word.length; i++) {
            if (word[i] != post[i - delta]) {
                result = false;
                break;
            }
        }
        return result;
    }
}