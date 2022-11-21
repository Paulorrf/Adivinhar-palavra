package com.adivnharpalavra;

public class App {
    public static void main(String[] args) {

        Word words = new Word();

        String[] myWords = { "laranja", "banana", "batata", "caju", "bergamota" };

        words.setWords(myWords);

        String word = words.getWord();

        System.out.println(word);

        words.setSecret(word);

        String palavra_secreta = words.getSecret();

        Game newGame = new Game(word, palavra_secreta);

        newGame.run();

    }
}
