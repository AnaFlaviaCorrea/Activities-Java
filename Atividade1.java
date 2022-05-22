/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosorteio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LG
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random numerosAleatorios = new Random();
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu palpite: ");
        int palpite = ler.nextInt();
        int sorteado;
        sorteado = numerosAleatorios.nextInt(51);
        int tentativas = 0;
        do {

            if (palpite != sorteado) {
                System.out.println("Seu palpite está muito longe");
                System.out.println("Digite um novo palpite: ");
                palpite = ler.nextInt();
            } else {
                if (palpite == sorteado);
                System.out.println("Parabéns, você acertou! O número era" + sorteado);
            }
            System.out.println("Você tentou" + tentativas + "antes de acertar");

            {

            }

            System.out.println("Número de tentativas " + tentativas);
            tentativas++;

        } while (palpite != sorteado);

    }

}
