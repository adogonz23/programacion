package ies.puerto;

public class Ejercicio6 {

    public int[][] dibujarMarco (int[][]marco){
        for(int i=0; i<marco.length;i++){
            for(int j=0;j<marco[i].length;j++){
                if (i==0||j==0) {
                    marco[i][j]=1;
                }else if (i==marco.length-1||j==marco[i].length-1) {
                    marco[i][j]=1;
                }else{
                    marco[i][j]=0;
                }
                    
                }
            }
            return marco;
        }

        
    }
    

