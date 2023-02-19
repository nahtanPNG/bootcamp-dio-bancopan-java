public class Calculadora {

    public static void main(String[] args) {

        double peso = Integer.valueOf(args[0]);
        double altura = Double.valueOf(args[1]);
        double imc = peso / (altura * altura);

        System.out.println("Você pesa " + peso + " kilos ");
        System.out.println("Sua altura é " + altura + "cm");
        System.out.println("Seu imc é: " + imc );
    }
}
