import java.util.Scanner;
public class Aula_05_FOR_EX_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular a soma de todos os números até ele: ");
        int limite = scanner.nextInt();
        int soma = 0;
        for (int i = 0; i <= limite; i++) {
            soma += i;
        }
        System.out.println("A soma de todos os número até " + limite + " é: " + soma);
        scanner.close();
    }
}
