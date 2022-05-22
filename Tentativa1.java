/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosorteio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LG
 */
public class Tentativa1 {

    public static void main(String[] args) {

        int number = 0;
        int attempt = 0;
        int guess = 0;
        Scanner read = new Scanner(System.in);

        number = (int) (Math.random() * 51);

        while (guess != number) {
            System.out.println("Digite seu palpite: ");
            guess = read.nextInt();
            attempt++;
            if (number < guess) {
                System.out.println("O número sorteado é menor !");
            } else if (number > guess) {
                System.out.println("O númmero sorteado é maior !");
            }
        }
        if (guess == number) {
            System.out.println("Parabéns! Você acertou o número em " + attempt + " tentativas. Número sorteado: " + number);
        }
    }

}
