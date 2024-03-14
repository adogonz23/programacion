package es.ies.puerto.ejercicio.tres;


public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        char[]vocales={'a','e','i','o','u'};
        char[] txtchar= texto.toLowerCase().toCharArray();
        int contador =0;
        for(int i=0;i<vocales.length;i++){
            int contadorAux=0;
            for(int j=0;j<txtchar.length;j++){
                if (txtchar[j]==vocales[i]) {
                    contadorAux++;
                }
            }
            if (contadorAux>contador) {
                contador= contadorAux;
                vocal=vocales[i];
            }
        }
        return vocal;
    }
    
}
