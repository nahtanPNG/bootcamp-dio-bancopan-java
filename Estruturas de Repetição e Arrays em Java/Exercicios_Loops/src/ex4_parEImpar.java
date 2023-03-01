import java.util.Scanner;

public class ex4_parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        int contador = 0;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if (numero % 2== 0) quantPares++; //Resto da divisão por 2 for igual a 0 = par
            else quantImpares++;

            contador++;
        } while (contador < quantNumeros);

        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números impares: " + quantImpares);
    }
}
