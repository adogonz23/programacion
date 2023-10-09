package ies.puerto;

//Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
public class NumerosAmstrong {
    public static void main(String[] args) {





        for (int i=1; i<= 1000;i++) {
            int c = 0, a = 0;
            int temp = i;
            while (temp > 0) {
                a = temp % 10;
                temp = temp / 10;
                c = c + (a * a * a);
            }
            if (c == i)
                System.out.println(i);


        }
    }
}