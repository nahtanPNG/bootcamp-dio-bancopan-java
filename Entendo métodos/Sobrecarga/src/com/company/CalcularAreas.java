package com.company;

public class CalcularAreas {

    public static void calcularArea(double lado){
        System.out.println("Area do quadrado: " + lado * lado);
    }
    public static void calcularArea(double base, double altura){
        System.out.println("Area do retangulo: " + base * altura);
    }
    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        System.out.println("Area do trapezio: " + ((baseMaior + baseMenor) * altura) /2);
    }
}
