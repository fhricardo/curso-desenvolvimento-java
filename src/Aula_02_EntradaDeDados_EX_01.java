import java.util.Scanner;
public class Aula_02_EntradaDeDados_EX_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano atual. Ex: 2024");
        int anoAtual = scanner.nextInt();
        System.out.println("Digite seu ano de nascimento. Ex.: 1990");
        int anoNascto = scanner.nextInt();
        int idade = anoAtual - anoNascto;
        System.out.println("Você tem "+idade+" anos");
        scanner.close();
    }
}
