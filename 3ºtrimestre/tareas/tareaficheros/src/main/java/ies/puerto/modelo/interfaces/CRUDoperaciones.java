package ies.puerto.modelo.interfaces;

import java.util.List;

import ies.puerto.modelo.entity.Persona;

public interface CRUDoperaciones {

public List<Persona>obtenerDatos(String path);
public boolean actualizarPersona(Persona persona);
public boolean añadirPersona(Persona persona, String path);
public Persona obtenerPersona(int id,String path);
public boolean eliminarPersonas(Persona persona ,String path);
public String getRUTA_FICHERO();
}
