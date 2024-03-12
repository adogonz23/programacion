package ies.puerto.modelo.entity.interfaces;

import java.util.List;

import ies.puerto.modelo.entity.Personaje;

public interface CrudFile {
    public List<Personaje> obtenerDatos();
    public boolean escribirFichero( List<Personaje>personajes);
    public boolean addPersonaje(Personaje personaje);
    public boolean eliminarPersonaje(Personaje personaje);
    public boolean actualizarPersonaje(Personaje personaje);
    public Personaje obtenerPersonaje(String nombre);
}
