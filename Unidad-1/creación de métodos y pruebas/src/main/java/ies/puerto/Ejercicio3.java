package ies.puerto;

import javax.swing.*;

public class Ejercicio3 {

    /**
     *
      * @param valor1
     * @param valor2
     * @return
     */
    public int mayor(int valor1, int valor2){
        if (valor1 < valor2){
            return valor2;

        }else {
            return  valor1;
        }
    }
    public int mayor(int valor1, int valor2, int valor3){
        int resultado = mayor(valor1,valor2);
        if (resultado<valor3){
            return valor3;
        }else {
            return resultado;

        }
    }
    public int mayor(int valor1, int valor2, int valor3, int valor4){
        int resultado = mayor(valor1,valor2,valor3);
        if (resultado<valor4){
            return valor4;
        }else {
            return resultado;

        }
    }
    public int menor(int valor1, int valor2){
        if (valor1 < valor2){
            return valor1;

        }else {
            return  valor2;
        }
    }
    public int menor(int valor1, int valor2, int valor3){
        int resultado = menor(valor1,valor2);
        if (resultado<valor3){
            return resultado;
        }else {
            return valor3;

        }
    }
    public int menor(int valor1, int valor2, int valor3, int valor4){
        int resultado = menor(valor1,valor2,valor3);
        if (resultado<valor4){
            return resultado;
        }else {
            return valor4;

        }
    }
    public int valorDesconocido ( int valor1, int valor2, int valor3){
        int valorMayor = mayor(valor1,valor2, valor3);
        int valorMenor = menor(valor1, valor2, valor3);
        int numeroRestante= (valor1 +valor2+valor3)-valorMayor-valorMenor;
        return numeroRestante;
    }
    public int valorDesconocido ( int valor1, int valor2, int valor3, int valor4){
        int valorMayor = mayor(valor1,valor2, valor3);
        int valorMenor = menor(valor1, valor2, valor3);
        int numeroRestante= (valor1 +valor2+valor3)-valorMayor-valorMenor;
        return numeroRestante;
    }
}