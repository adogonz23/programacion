package ies.puerto.app;

import ies.puerto.impl.Ciruclo;
import ies.puerto.impl.Cuadrado;
import ies.puerto.impl.Rectangulo;
import ies.puerto.interfaz.IFormaGeomatrica;

public class CalcularAreas {
    static IFormaGeomatrica cuadrado;
    static IFormaGeomatrica circulo;
    static IFormaGeomatrica rectangulo;
    public static void main(String[] args) {
        circulo = new Ciruclo(5);
        cuadrado = new Cuadrado(5);
        rectangulo = new Rectangulo(6, 7);
        System.out.println(cuadrado.toString());
        System.out.println(circulo.toString());
        System.out.println(rectangulo.toString());
    }
}
