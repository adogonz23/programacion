package ies.puerto;
/**
 * @author adogonz23
 */
public class Ejercicio6 {

    public int[][] dibujarMarco (int[][]marco){
        for(int i=0; i<marco.length;i++){
            for(int j=0;j<marco[i].length;j++){
                if (i==0||i==marco.length-1) {
                    marco[i][j]=1;
                }else if (j==0||j==marco[i].length-1) {
                    marco[i][j]=1;
                }
                    
                }
            }
            return marco;
        }

        
    }
    

