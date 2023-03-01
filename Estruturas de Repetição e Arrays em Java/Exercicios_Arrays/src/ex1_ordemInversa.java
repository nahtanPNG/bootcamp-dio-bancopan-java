public class ex1_ordemInversa {
    public static void main(String[] args) {

        int [] vetor = {0, 5, 876, -234, 345, -2324452}; //Criando vetor
        int contador = 0;

        System.out.print("Vetor:");
        while(contador < vetor.length){ //sempre começa no 0, por isso o lenght - 1
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\n Vetor inverso:");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
