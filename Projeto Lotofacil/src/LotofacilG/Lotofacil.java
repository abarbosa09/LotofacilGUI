package LotofacilG;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lotofacil {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); //lê a entrada do usuario
        Random random = new Random();
        char letraPremiada = 'A'; // Escolha a letra premiada
        int numeroSorteado = random.nextInt(101); // Gera um número aleatório entre 0 e 100

        int escolha;
        do {
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em número par ou ímpar");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    int numeroApostado = scanner.nextInt();

                    if (numeroApostado < 0 || numeroApostado > 100) {
                        System.out.println("Aposta inválida.");
                    } else if (numeroApostado == numeroSorteado) {
                        System.out.println("Você ganhou R$ 1.000,00 reais.");
                    } else {
                        System.out.println("Que pena! O número sorteado foi: " + numeroSorteado + ".");
                    }
                    break;

                case 2:
                    System.out.print("Digite uma letra de A a Z: ");
                    char letraApostada = Character.toUpperCase((char) System.in.read());
                    System.in.skip(2); // Limpa o buffer do teclado

                    if (Character.isLetter(letraApostada)) {
                        if (letraApostada == letraPremiada) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                    break;

                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numeroParImpar = scanner.nextInt();

                    if (numeroParImpar % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do jogo.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
