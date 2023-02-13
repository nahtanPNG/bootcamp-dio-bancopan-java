package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        livro livro1 = new livro("Entendendo Algoritmos", 263);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }
}

class livro {
    private String nome;
    private Integer numPag;

    public livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}