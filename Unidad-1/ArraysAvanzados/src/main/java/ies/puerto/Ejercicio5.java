package ies.puerto;
/** 
 * @author adogonz23
 */
public class Ejercicio5 {
    public int[][] crearDiagonal(int[][]diagonal){
        for (int i=0; i<diagonal.length;i++){
            for(int j =0;j<diagonal[i].length;j++){
                if (i==j){
                    diagonal[i][j]=1;
                }else{
                    diagonal[i][i]=0;
                }
            }
        }
        return diagonal;
    }
    public void imprimirMatriz(){
        
    }
}
