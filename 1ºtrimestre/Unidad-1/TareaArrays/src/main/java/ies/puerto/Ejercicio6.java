package ies.puerto;
/** dada una matriz cuadrada, haya su transpuesta
 * @author adogonz23
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz={{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrizTranspuesta= hallarTranspuesta(matriz);
        System.out.println("matriz original");
        impimirMatrices(matriz);
        System.out.println("matriz transpuesta");
        impimirMatrices(matrizTranspuesta);
    }
/**
 * 
 * @param matriz la cual queremos hayar su tranpuesta 
 * @return el valor de la filas en las columnas y el de las comlunas en las filas en una nueva matriz
 */
    public static int[][] hallarTranspuesta(int[][] matriz){
        int [][] matrizTranspuesta= new int[matriz[0].length][matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                matrizTranspuesta[j][i]=matriz[i][j];
            }
        }
        
        return matrizTranspuesta;


    }
    public static void impimirMatrices(int[][]matriz){
        for(int i=0;i< matriz.length;i++){
            for(int j=0; j< matriz[i].length;j++){
                System.out.println(matriz [i][j]);
            }
        System.out.println();
        }
    }
    }

    
