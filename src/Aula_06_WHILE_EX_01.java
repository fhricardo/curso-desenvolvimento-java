import java.util.Scanner;
public class Aula_06_WHILE_EX_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if(numero <= 0 || numero > 10000) {
            System.out.println("O número digitado não é válido.");
        } else {
            System.out.println("Contagem regressiva a partir de " + numero + ":");
            while(numero >= 0) {
                System.out.println(numero);
                numero--;
            }
        }
        scanner.close();
    }
}
