package ies.puerto;

public class FizzBuzz{
    public static void main( String[] args ){
        for(int i=1;i<=100;i++){
            fizbuz(i);
        }
    }

    public static void fizbuz(int numero){
        if (numero % 3 ==0 && numero %5==0) {
            System.out.println("FizzBuzz");
        }
        else if (numero %3== 0) {
            System.out.println("fizz");
        }
        else if (numero%5==0) {
            System.out.println("buzz");
        }else{
            System.out.println(numero);
        }
    }
}
