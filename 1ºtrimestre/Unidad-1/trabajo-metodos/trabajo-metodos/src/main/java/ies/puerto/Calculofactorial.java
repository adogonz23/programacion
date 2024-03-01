package ies.puerto;

/**
 * clase que tiene como objetivo realizar el calculo de factorial
 * @author adogonz23
 */
public class Calculofactorial {
    public static void main(String[] args) {
        int numero=5;
        System.out.println("Calculando el facorial de "+numero+", es "+calculoFactoria(numero));
    }

    /**
     * metodo que realiza el calculo del factorial
     * @param numero valor sobre el qe se realiza el calculo
     * @return factorial del numero dado
     */
    public static int calculoFactoria(int numero){
        int resultado=1;

        for (int i =2; i<=numero; i++){
            resultado=resultado*i;
        }
        return resultado;
    }
}