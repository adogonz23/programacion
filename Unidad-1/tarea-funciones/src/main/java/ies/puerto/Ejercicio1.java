package ies.puerto;

/** Ejercicio 1, crea un algoritmo que haye el area de un triangulo
 * @author adogonz23
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * funcion que realiza el area de un triagunlo
     * @param base valor numerico de la base del triangulo
     * @param altura valor numerico de la altura de un triangulo
     * @return area del triagulo
     */
    public int areaTriangulo(int base, int altura) {
        int resultado = (base*altura)/2;
        return resultado;
    }

}