package ies.puerto;
// Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
public class numerosAmstrong2 {
    public static void main (String[] args ){

        int c,d,u;         
        
        for(int i = 1; i <=1000;i++){// bucle que recorrera y comprabara cada numero del 1 al 1000
            int temp = i; 
            u= temp % 10;
            d= (temp%100)/10;
            c= temp/100; // esta forula nos permite hayar el valor de las unidades decenas y centenas
            int suma;
            suma = u*u*u +d*d*d+c*c*c; 
             if(suma==temp){
                System.out.println(temp);// formula matematica nos sirve pra hayar los amstrong en caso de que el valor de la suma sea igual al del temporal nos imprimira el numero.
             }
        }
        
    }
    
}
