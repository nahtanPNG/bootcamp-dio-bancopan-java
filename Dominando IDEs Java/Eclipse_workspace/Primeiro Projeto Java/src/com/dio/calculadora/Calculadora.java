package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int subtra��o = subtra��o(a,b);
		int divis�o = divis�o(a,b);
		int multiplica��o = multiplia��o(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("subtra��o " + subtra��o);
		System.out.println("divis�o " + divis�o);
		System.out.println("multiplica��o" + multiplica��o);
		
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtra��o(int a, int b) {
		return a - b;
	}
	public static int divis�o(int a, int b) {
		return a / b;
	}
	public static int multiplia��o(int a, int b) {
		return a * b;
	}
	
	
}
