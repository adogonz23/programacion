package ies.puerto;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        int[] arrray={-2,5,-8,10,15,-3,7};
        for(int num:arrray){
            if (num<=0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
