package ies.puerto;


public class NumeroPrimo {
    public static void main( String[] args ){
        for(int i=2;i<=1000;i++){
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean esPrimo(int numero){
        int contador= 0;
        for(int i=1;i<=numero;i++){
            if (numero%i==0) {
                contador++;
            }
            if (contador>2) {
                return false;
            }
        }
        return true;
    }
}
