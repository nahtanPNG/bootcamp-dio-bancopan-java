import java.util.Scanner;

public class ex5_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero para realizar a tabuada: ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + numero*i);
        }
    }
}
