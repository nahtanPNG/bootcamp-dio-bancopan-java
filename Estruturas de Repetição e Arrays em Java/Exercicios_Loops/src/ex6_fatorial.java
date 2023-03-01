import java.util.Scanner;

public class ex6_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor para fatorar: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial; i >= 1 ; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
