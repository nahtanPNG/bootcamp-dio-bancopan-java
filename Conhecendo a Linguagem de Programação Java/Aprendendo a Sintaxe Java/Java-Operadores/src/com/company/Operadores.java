package com.company;

public class Operadores {

    public static void main(String[] args) {
        //CONCATENAÇÃO

	    String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        /*Unários
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = + numero; //Para converter em forma de positivo precisamos fazer uma multiplicação
        numero = numero * -1;

        System.out.println(numero);

        //Incremento de números
         */

        int numero = 5;

        numero++; //igual numero = numero + 1

        System.out.println( -- numero);
        System.out.println(numero);

        //Anulando boolean
        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel; //reatribuindo, passando de true para false

        System.out.println(variavel);

        //Ternário

        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */

        System.out.println(resultado);

        //Relacionais

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        String nomeUm = "Nathan";
        String nomeDois = new String("Gleyson");

        System.out.println(nomeUm.equals(nomeDois)); //Equals compara conteudos dos objetos

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("NumeroUm é Diferente a numeroDois? " + simNao);

        //lógicas

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");;


        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
