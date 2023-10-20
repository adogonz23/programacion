package ies.puerto;

/**Realiza una función que realiza el cálculo del área en circulo
 * @author adogonz23
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion para haya el area del circulo
     * @param radio valor del radio del circulo
     * @return resultado
     */
    public double areaCirculo(int radio) {
        double resultado = (radio*radio)*3.14;

        return resultado;
    }
}