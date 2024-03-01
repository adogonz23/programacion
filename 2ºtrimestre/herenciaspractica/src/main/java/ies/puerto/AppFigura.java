package ies.puerto;

public class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;
    public static void main(String[] args) {
        cuadrado=new Cuadrado(5);
        triangulo = new Triangulo(5,10);
        rectangulo=new Rectangulo(5, 12);

        System.out.println(cuadrado);
        mostrarArea(cuadrado);
        System.out.println(triangulo);
        mostrarArea(triangulo);
        System.out.println(rectangulo);
        mostrarArea(rectangulo);
        System.out.println("vlor de mi area rectangulo: "+rectangulo.area());
    }
    public static void mostrarArea(Figura figura){
        System.out.println("valor del area es "+figura.calcularArea());
    }
}
