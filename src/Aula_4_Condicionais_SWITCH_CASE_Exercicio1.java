import java.util.Scanner;
public class Aula_4_Condicionais_SWITCH_CASE_Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do animal: ");
        String animal = scanner.nextLine().toLowerCase();

        switch (animal) {
            case "cachorro":
            case "gato":
                System.out.println("Mamífero");
                break;
            case "cobra":
            case "lagarto":
                System.out.println("Réptil");
                break;
            case "papagaio":
            case "arara":
                System.out.println("Ave");
                break;
            case "tilapia":
            case "sardinha":
                System.out.println("Peixe");
                break;
            default:
                System.out.println("Tipo de animal desconhecido");
        }
        scanner.close();
    }
}
