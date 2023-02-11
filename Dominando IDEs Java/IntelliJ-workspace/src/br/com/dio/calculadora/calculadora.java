package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int sub = sub(a, b);
        int div = div(a, b);
        int mult = mult(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subt: " + sub);
        System.out.println("div: " + div);
        System.out.println("mult: " + mult);

    }
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
}
