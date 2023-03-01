public class ex1_ordemInversa {
    public static void main(String[] args) {

        int [] vetor = {0, 5, 876, -234, 345, -2324452}; //Criando vetor
        int contador = 0;

        System.out.println("Vetor:");
        while(contador < vetor.length){ //sempre começa no 0, por isso o lenght - 1
            System.out.print(vetor[contador] + " ");
            contador++;
        }
    }
}
