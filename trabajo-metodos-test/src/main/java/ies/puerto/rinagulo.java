package ies.puerto;

public class rinagulo {
    public static void main(String[] args) {
        triangulo(5);
        System.out.println("");
        trianguloinv(5);
        System.out.println("");
        trianguloCompleto(5);
        System.out.println("");
        trianguloinvCompleto(5);
    }
    public static void triangulo(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void trianguloinv(int n){
        for(int i=0;i<n;i++){
            for (int j=n-1-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void trianguloCompleto(int n){
        for(int i=0;i<n;i++){
            for (int j=n-1-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void trianguloinvCompleto(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=n-1-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

