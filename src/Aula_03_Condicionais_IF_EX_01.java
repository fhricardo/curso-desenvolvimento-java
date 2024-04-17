import java.util.Scanner;
public class Aula_03_Condicionais_IF_EX_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();
        System.out.println("Digite a nota do aluno: ");
        int nota = scanner.nextInt();
        String status;
        if (nota >= 7){
            status = "foi aprovado";
        }else if(nota >= 5){
            status = "está em recuperação";
        }else{
            status = "foi reprovado";
        }
        System.out.println("O aluno "+aluno+" "+status);
        scanner.close();
    }
}
