import java.util.Scanner;
public class Aula_02_EntradaDeDados_EX_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        String resultado = numero % 2 == 0 ? "par" : "ímpar";
        System.out.println("O número informado ("+numero+") é "+ resultado);
        scanner.close();
    }
}