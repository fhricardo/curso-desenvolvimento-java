import java.util.Scanner;
import java.util.Random;

public class Aula_08_DESAFIO_02_Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pontosTotais = 0;
        int tentativasMax;
        int pontuacaoMax;
        int penalidade;

        for (int fase = 1; fase <= 3; fase++) {
            System.out.println("\n--- Fase " + fase + " ---");

            // Definir configurações de cada fase
            switch (fase) {
                case 1:
                    tentativasMax = 10;
                    pontuacaoMax = 100;
                    penalidade = 10;
                    break;
                case 2:
                    tentativasMax = 5;
                    pontuacaoMax = 250;
                    penalidade = 50;
                    break;
                case 3:
                    tentativasMax = 3;
                    pontuacaoMax = 300;
                    penalidade = 100;
                    break;
                default:
                    tentativasMax = 0;
                    pontuacaoMax = 0;
                    penalidade = 0;
            }

            // Gerar um número aleatório de 1 a 100
            int numeroAleatorio = random.nextInt(100) + 1;
            int tentativasUsadas = 0;
            int pontosFase = pontuacaoMax;
            boolean acertou = false;

            // Loop de tentativas
            while (tentativasUsadas < tentativasMax) {
                System.out.print("Tentativa " + (tentativasUsadas + 1) + ": Digite um número de 1 a 100: ");
                int numeroEscolhido = scanner.nextInt();

                // Validar a entrada
                if (numeroEscolhido < 1 || numeroEscolhido > 100) {
                    System.out.println("Número inválido! Insira um número entre 1 e 100.");
                    continue;
                }

                tentativasUsadas++;

                // Verificar se o jogador acertou
                if (numeroEscolhido == numeroAleatorio) {
                    System.out.println("Parabéns! Você acertou o número.");
                    acertou = true;
                    break;
                } else if (numeroEscolhido < numeroAleatorio) {
                    System.out.println("O número é maior!");
                } else {
                    System.out.println("O número é menor!");
                }

                // Reduzir a pontuação da fase
                pontosFase -= penalidade;
            }

            // Se o jogador não acertar o número nas tentativas permitidas, o jogo termina
            if (!acertou) {
                System.out.println("Você não acertou o número. Jogo encerrado.");
                System.out.println("Pontuação total final: " + pontosTotais);
                scanner.close();
                return;
            }

            // Acumular a pontuação total
            pontosTotais += pontosFase;

            // Mostrar pontuação da fase e total acumulada
            System.out.println("Pontuação nesta fase: " + pontosFase);
            System.out.println("Pontuação total acumulada: " + pontosTotais);
        }

        // Mostrar pontuação final
        System.out.println("\n--- Jogo encerrado ---");
        System.out.println("Pontuação total final: " + pontosTotais);
        scanner.close();
    }
}
