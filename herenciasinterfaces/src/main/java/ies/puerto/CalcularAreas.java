package ies.puerto;

public class CalcularAreas {
    static Cuadrado cuadrado;
    static Ciruclo circulo;
    public static void main(String[] args) {
        circulo = new Ciruclo(4);
        cuadrado = new Cuadrado(4);

        System.out.println(cuadrado.toString());
        System.out.println(circulo.toString());
    }
}
