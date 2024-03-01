package ies.puerto;
/**Escribe un programa que encuentre el primer número divisible por 5 y mayor que 30, utilizando break
 * @author adogonz23
 */
public class Ejercicio5 {
    public void busquedaNumero(){
        for(int i= 31; i<100;i++){
            if (i%5==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
