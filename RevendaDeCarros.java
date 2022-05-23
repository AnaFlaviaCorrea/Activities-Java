package revenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RevendaDeCarros {

    public static void main(String[] args) {
        List<String> carros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String novoCarro;
        System.out.print("Funcionário insira os carros no estoque:");
        novoCarro = input.next();

        carros.add(novoCarro);

        for (int i = 0; i < 6; i++) {
            System.out.print("Deseja inserir novos carros? Se sim digite 1 e se não digite 0: ");
            int valor = input.nextInt();
            if (valor == 1) {
                System.out.print("Insira novos modelos de carros: ");

                String novoCarro1 = input.next();
                String novoCarro2 = input.next();
                String novoCarro3 = input.next();
                String novoCarro4 = input.next();
                String novoCarro5 = input.next();

                carros.add(novoCarro1);
                carros.add(novoCarro2);
                carros.add(novoCarro3);
                carros.add(novoCarro4);
                carros.add(novoCarro5);
                System.out.println("Os carros inseridos no estoque são:  " + novoCarro + ", " + novoCarro1 + ", " + novoCarro2 + ", " + novoCarro3 + ", " + novoCarro4 + ", " + novoCarro5);

            } else {
                System.out.println("Inserção de carros finalizada");
                break;
            }
        }
        System.out.print("Qual carro você gostaria de comprar? ");
        String carroComprado = input.next();

        if (carros.contains(carroComprado)) {
            String opcao = carroComprado;

            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "O carro selecionado foi:\n\n '"
                    + opcao + "'.", "Carro escolhido", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Você deseja comprar o carro? Responda com 0 para sim ou 1 para não.");
            int entradaUsuario = input.nextInt();

            if (entradaUsuario == 0) {
                System.out.println("Você deseja dar o seu carro em troca? Digite S para sim e N para não");
                String carroTroca = input.next();

                switch (carroTroca) {

                    case "S":
                        System.out.println("Qual é o seu carro atual?");
                        String carroAtual = input.next();
                        int troca = carros.indexOf(carroComprado);
                        carros.set(troca, carroAtual);
                        System.out.println("Você comprou um novo carro e deu em troca o carro: " + carroAtual + " pelo carro: " + carroComprado);
                        break;

                    case "N":
                        carros.remove(carroComprado);
                        System.out.println("Você comprou: " + carroComprado);

                        break;

                    default:
                        System.out.println("Informação inválida");
                }
            } else {
                System.out.println("Cliente não deseja realizar a compra");
            }

        } else {
            System.out.println("Carro informado não tem na nossa revenda, por gentileza nos informe S para continuar buscando um novo modelo ou N para parar a busca: ");
            String busca = input.next();
            switch (busca) {

                case "S":
                    System.out.print("Qual novo modelo de carro deseja pesquisar?");
                    carroComprado = input.next();
                    System.out.println("Você comprou " + carroComprado);
                    carros.remove(carroComprado);

                    break;
                case "N":
                    System.out.print("Que pena não termos encontrado o carro de sua preferência. Faça uma nova pesquisa no futuro!");
                    break;
                default:
                    System.out.println("Informação inválida");
            }
        }
        System.out.println("Ainda temos em nossos estoques: " + carros);
    }
}
