package ies.puerto;

import java.util.Scanner;

//Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
//El día a verificar se debe de pedir por teclado.
public class Dias_Semana {
    public static void main (String[] args){

        Scanner lector= new Scanner(System.in);
        int n;
        System.out.println("ingrese un numero del 1 al 7");// en este switch le dares una condicion a cada numero del 1 al 7 para que imprima el dia de la semana aignadoa cada numero.
        
        n= lector.nextInt();
        switch (n){
            case 1:
                if (n ==1){
                    System.out.println("hoy es lunes");
                    break;
                }
            case 2:
                if (n ==2){
                    System.out.println("hoy es martes");
                    break;
                }
            case 3:
                if (n ==3){
                    System.out.println("hoy es miercoles");
                    break;
                }
            case 4:
                if (n ==4){
                    System.out.println("hoy es jueves");
                    break;
                }
            case 5:
                if (n ==5){
                    System.out.println("hoy es viernes");
                    break;
                }
            case 6:
                if (n ==6){
                    System.out.println("hoy es sabado");
                    break;
                }
            case 7:
                if (n ==7){
                    System.out.println("hoy es domingo");
                    break;
                }
            default:
            
                    System.out.println("te dije entre 1 y 7 ...");
                
        }
    }
}
