package ies.puerto.negocio.implementacion;

import java.util.List;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.file.implementacion.csv.FileCsv;

public class TiendaNegocio extends FileCsv{
    FileCsv fileCsv;
    
    public TiendaNegocio(){
        fileCsv =new FileCsv();
    }
    public List<Alimento> obtenerListaAlimentos(){
        return fileCsv.obtenerAlimentos();
    }
    public Alimento mostrarAlimento(int id){
        Alimento alimento = new Alimento(id);
        List<Alimento> alimentos= obtenerAlimentos();
        if (alimentos.contains(alimento)) {
            return alimentos.get(alimentos.indexOf(alimento));
        }
        alimento=null;
        return alimento;
    }
    public boolean actualizarAlimento(Alimento alimento){
        List<Alimento> alimentos= obtenerListaAlimentos();
        if (existeAlimento(alimentos, alimento)) {
            return fileCsv.actualizar(RUTA_FICHERO, alimento);
        }
        return false;
    }
    public boolean existeAlimento(List<Alimento>alimentos,Alimento alimento){
        if (alimentos.contains(alimento)) {
            return true;
        }
        return false;
    }
    public boolean eliminarAlimento(int id, List<Alimento>alimentos){
        Alimento alimento=new Alimento(id);
        if (alimentos.contains(alimento)) {
            return fileCsv.eliminar(RUTA_FICHERO, id);
            
        }
        return true;
    }

}
