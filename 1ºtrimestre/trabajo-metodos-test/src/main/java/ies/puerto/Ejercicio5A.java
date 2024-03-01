package ies.puerto;

public class Ejercicio5A {
    public static void main(String[] args) {
        piramideinv(5);
        piramide(5);
        }
        public static void piramide(int numero){
            for (int i=1;i<=numero;i++){
                for (int j=1;j<=numero;j++){
                    System.out.print(" ");
                } 
                for(int k=2;k<=2*i-1;k++){
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
        public static void piramideinv(int numero){
            for (int i=numero;i>=1;i--){
                for (int j=1;j<=numero;j++){
                    System.out.print(" ");
                } 
                for(int k=2;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
}
