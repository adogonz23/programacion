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
            alimentos.set(alimentos.indexOf(alimento), alimento);
            return true;
        }
        return false;
    }
    public boolean notEmpty(List<Alimento> alimentos){
        if (alimentos.isEmpty()) {
            return false;
        }
        return true;
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
            return alimentos.remove(alimento);
            
        }
        return true;
    }
}
