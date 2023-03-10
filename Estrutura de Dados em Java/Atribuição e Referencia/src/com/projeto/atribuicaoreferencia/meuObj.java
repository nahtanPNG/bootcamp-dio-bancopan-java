package com.projeto.atribuicaoreferencia;

public class meuObj {

    Integer num;

    public void setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
