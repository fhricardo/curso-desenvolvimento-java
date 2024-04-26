import java.util.Random;
import java.util.Scanner;
public class Aula_08_DESAFIO_O_JOGO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Você deve adivinhar um número de 1 a 100. Que comece a primeira fase!");

        int pontosTotais = 0;
        int stage = 1;

        while (stage <= 3) {
            System.out.println("\n--- Fase " + stage + " ---");

            // Configurações de cada fase
            int tentativasMax, pontuacaoMax, penalidade;
            int secret = random.nextInt(100) + 1;

            switch (stage) {
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

            int pontosFase = pontuacaoMax;
            boolean acertou = false;

            // Loop de tentativas
            for (int tentativa = 1; tentativa <= tentativasMax; tentativa++) {
                System.out.println(secret);
                System.out.print("Tentativa " + tentativa + ": Digite um número de 1 a 100: ");
                int numeroEscolhido = scanner.nextInt();

                // Verificar se o número escolhido está no intervalo válido
                if (numeroEscolhido < 1 || numeroEscolhido > 100) {
                    System.out.println("Número inválido! Insira um número entre 1 e 100.");
                    tentativa--;  // Não conta a tentativa
                    continue;
                }

                // Verificar se o jogador acertou
                if (numeroEscolhido == secret) {
                    System.out.println("Parabéns! Você acertou o número.");
                    acertou = true;
                    break;
                } else if (numeroEscolhido < secret) {
                    System.out.println("O número é maior!");
                } else {
                    System.out.println("O número é menor!");
                }

                // Reduzir a pontuação da fase
                pontosFase -= penalidade;
            }

            // Verificar se o jogador perdeu na fase
            if (!acertou) {
                System.out.println("Você perdeu! O número era " + secret);
                System.out.println("Pontuação total final: " + pontosTotais);
                scanner.close();
                return;  // Termina o jogo
            }

            // Acumular a pontuação total
            pontosTotais += pontosFase;

            // Mostrar pontuação da fase e total acumulada
            System.out.println("Pontuação nesta fase: " + pontosFase);
            System.out.println("Pontuação total acumulada: " + pontosTotais);

            // Incrementar a fase
            stage++;
        }

        // Mostrar pontuação final
        System.out.println("\n--- Jogo encerrado ---");
        System.out.println("Pontuação total final: " + pontosTotais);
        scanner.close();
    }
}
