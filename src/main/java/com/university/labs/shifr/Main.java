package com.university.labs.shifr;

public class Main {
    private static final String WORD_FOR_CODE = "BUBU ya blabla";
    private static final String KEY = "yakluch";

    public static void main(String... args){
        JailEncoder jailEncoder = new JailEncoder(KEY);
        String coded = jailEncoder.encodeWord(WORD_FOR_CODE);
        String decoded = jailEncoder.decodeWord(coded);
        System.out.println("DECODED WORD: " + decoded);
    }
}
