import java.util.Random;

public class ex3_numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //Gerar numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);//bound é o limite
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero);
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero+1) + " ");
        }
    }
}
