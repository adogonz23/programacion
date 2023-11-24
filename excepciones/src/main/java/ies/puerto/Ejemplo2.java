package ies.puerto;

public class Ejemplo2 {

    public static void main(String[] args) {
        
        int numero=10;
        int divisor= 1;
        
        try {
            int div = numero/divisor;
            System.out.println(div);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("se ha producido un error aricmetico:"+arithmeticException.getMessage());
        }
        
    }

}
