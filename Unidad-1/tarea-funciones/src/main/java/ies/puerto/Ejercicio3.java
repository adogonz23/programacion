package ies.puerto;

/**realiza una función que realiza el cálculo del área en cuadrado y un rectángulo.
 * @author adogonz23
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     *función que realiza el valor de un cuadrado
     * @param a  valor de un "lado" del cuadrado
     * @return valor del area
     */
    public int areaCuadrado(int a) {
        int resultado = a*a;

        return resultado;
    }

    /**
     *
     * @param a valor del lado menor
     * @param b
     * @return
     */
    public int areaRectangulo(int ladoMenor, int ladoMayor) {
        int resultado = ladoMayor*ladoMenor;

        return resultado;
    }
}