package ies.puerto.modelo.file.json.implementacion;

import java.util.List;

import ies.puerto.modelo.entity.Persona;
import ies.puerto.modelo.file.abstractas.FlieAbstrac;
import ies.puerto.modelo.interfaces.CRUDoperaciones;

public class FileJson extends FlieAbstrac implements CRUDoperaciones {
    
    
    @Override
    public List<Persona> obtenerDatos(String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerDatos'");
    }

    

    @Override
    public boolean actualizarPersona(Persona persona) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarPersona'");
    }

    @Override
    public boolean añadirPersona(Persona persona, String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadirPersona'");
    }

    @Override
    public Persona obtenerPersona(int id, String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerPersona'");
    }

    @Override
    public boolean eliminarPersonas(Persona persona, String path) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarPersonas'");
    }

    @Override
    public String getRUTA_FICHERO() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRUTA_FICHERO'");
    }
    
}
