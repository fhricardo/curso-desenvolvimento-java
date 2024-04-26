import java.util.Random;
import java.util.Scanner;
public class Aula_07_DESAFIO_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativasRestantes = 10; // Número de tentativas disponíveis
        int palpite = 0; // Inicializa a variável para armazenar o palpite do usuário

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        // Loop while para controlar as tentativas
        while (tentativasRestantes > 0) {
            System.out.print("Você tem "+tentativasRestantes+" tentativas. Digite o seu palpite: ");
            palpite = scanner.nextInt(); // Lê o palpite do usuário

            // Verifica se o palpite é igual ao número secreto
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + ".");
                break; // Sai do loop, pois o usuário acertou o número
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Muito baixo! Tente novamente.");
            }

            // Diminui o número de tentativas restantes
            tentativasRestantes--;

            // Verifica se não restam mais tentativas
            if (tentativasRestantes == 0) {
                System.out.println("Você perdeu! O número era " + numeroSecreto + ".");
            }
        }

        scanner.close();
    }
}
