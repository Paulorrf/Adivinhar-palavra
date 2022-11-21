package com.adivnharpalavra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    String word;
    String palavra_secreta;

    Game(String word, String palavra_secreta) {
        this.word = word;
        this.palavra_secreta = palavra_secreta;
    }

    void run() {
        List<String> letrasErradas = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int chances = 10;

        while (chances > 0) {
            System.out.println("Digite uma letra: ");
            char letra = scanner.next().charAt(0);
            boolean containLetra = false;

            for (int i = 0; i < this.word.length(); i++) {
                char c = this.word.charAt(i);
                if (c == letra) {
                    this.palavra_secreta = this.palavra_secreta.substring(0, i) + letra
                            + this.palavra_secreta.substring(i + 1);
                    containLetra = true;
                }

            }

            if (!containLetra) {
                letrasErradas.add(Character.toString(letra));
                System.out.println("letras erradas" + letrasErradas);
            }

            if (!this.palavra_secreta.contains("_")) {
                System.out.println("Você acertou a palavra era " + this.palavra_secreta);
                break;
            }

            System.out.println(this.palavra_secreta);

            chances--;
        }
        scanner.close();
    }

}
