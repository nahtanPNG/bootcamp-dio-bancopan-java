import java.util.Scanner;

public class ex3_maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int numMaior = 0;
        int soma = 0;
        int contador = 0;

        while(contador < 5) {
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();
            soma += numero; //Somando todos os valores colocados
                if (numero > numMaior) numMaior = numero;
            contador++;
        }

        System.out.println("O maior numero digitado foi: " + numMaior);
        System.out.println("A média dos 5 numeros digitados é: " + (soma/5));
    }
}
