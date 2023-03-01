import java.util.Scanner;

public class ex2_consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;
        do {
            System.out.println("Digite as letras: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }

            contador++;

        }while (contador < consoantes.length);

        System.out.println("Consoantes");
        for ( String consoante : consoantes ) {  //Tipo do elemento e array, criou uma variavel para mostrar os elementos
            if ( consoante != null) //para não imprimir as vogais
            System.out.print(consoante + " ");
        }
    }
}
