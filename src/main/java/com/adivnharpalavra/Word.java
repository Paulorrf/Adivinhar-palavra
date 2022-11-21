package com.adivnharpalavra;

import java.util.Random;

public class Word {
    public String[] words;
    public int wordLength;

    public String getWord() {
        Random random = new Random();
        int randomNumber = random.nextInt(this.words.length); // 0 to 2
        String element = words[randomNumber];
        return element;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public void setSecret(String word) {
        this.wordLength = word.length();
    }

    public String getSecret() {
        String palavra_secreta = "";

        for (int i = 0; i < wordLength; i++) {
            palavra_secreta = palavra_secreta + "_";
        }

        return palavra_secreta;
    }
}
