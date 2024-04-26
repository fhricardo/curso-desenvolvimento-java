import java.util.Random;

public class Aula_07_Random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println(num);
    }
}
