package ies.puerto;
/** crea una tabla bidimensionarl 5x5
 * carga la tabla con valores entereos 
 * suma todos los elementos de cada fila y todos los elemento de cada columna y muestralos en pantalla
 * @author adogonz23
 */
public class Ejercicio4 {
    /**
     *  
     * @param matriz de entrada con los valores 
     */
    public void sumaMatriz(int[][]matriz){
        int suma=0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                suma= matriz[i][j]+matriz[i][j+1];
                System.out.println(matriz[i][j]+"+"+matriz[i][j+1]+"="+suma);
            }
        }
    }
}
