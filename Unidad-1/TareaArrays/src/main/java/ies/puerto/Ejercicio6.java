package ies.puerto;
/** dada una matriz cuadrada, haya su transpuesta
 * @author adogonz23
 */
public class Ejercicio6 {

    public static int[][] hallarTranspuesta(int[][] matrizOriginal){
        int [][] matrizTranspuesta= new int[matrizOriginal[0].length][matrizOriginal.length];
        for(int i=0;i<matrizOriginal.length;i++){
            for(int j=0; j<matrizOriginal[i].length;j++){
                matrizTranspuesta[j][i]=matrizOriginal[i][j];
            }
        }
        
        return matrizTranspuesta;


    }

    
}