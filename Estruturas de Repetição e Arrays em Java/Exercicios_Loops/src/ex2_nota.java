import java.util.Scanner;

public class ex2_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite uma nota valida: ");
            nota = scan.nextInt();
        }
    }
}
