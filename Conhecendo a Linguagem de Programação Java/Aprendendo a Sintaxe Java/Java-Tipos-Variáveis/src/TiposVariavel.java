public class TiposVariavel {
    public static void main(String[] args) {
        double salarioMinimo = 2500.33;

        //TIPOS

        byte idade = 123;
        short ano = 2023;
        int cep = 21070333; //se começar com zero, talvez tenha usar outro tipo - java não armazena o zero
        long cpf = 103485476292L; //se começar com zero, talvez tenha usar outro tipo - tem que por L no final
        float pi = 3.14F; //Tem que colocar o F no final
        double salario = 1275.22;

        // ENTENDENDO CASTING

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Casting

        //VARIAVEIS X CONSTANTES
        int numero = 2;

        numero = 10;
        System.out.println(numero);

        //CONSTANTE
        final double VALOR_DE_PI = 3.14;
    }
}
