import java.util.Scanner;

public class Aula_05_Repeticao_FOR_EX_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        System.out.println("Aqui está a tabuada do "+numero+":");
        for (int i = 1 ; i <= 10 ; i++){
            int resultado = numero * i;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
        scanner.close();
    }
}
