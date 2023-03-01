import java.util.Scanner;

public class ex1_nomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Entrada de dados pelo teclado

        String nome;
        int idade;

        while (true){
        System.out.println("Nome: ");
        nome = scan.next(); //Nex retorna tring
            if (nome.equals("0")) break; //se o nome for igual a 0 ele para(break)

        System.out.println("Idade: ");
        idade = scan.nextInt();

        }

    }
}
