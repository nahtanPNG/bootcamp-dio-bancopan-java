package com.dio;

import com.dio.model.Gato; //CTRL + SHIFT + O IMPORTA

public class PrimeiroProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para criar essa estrutura voc� pode digitar MAIN, dar um ctrl + espa�o e selecionar a op��o que queira
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/* int a = 2;
		int b = 2;
		System.out.println("Hello World!" + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String tema;
}