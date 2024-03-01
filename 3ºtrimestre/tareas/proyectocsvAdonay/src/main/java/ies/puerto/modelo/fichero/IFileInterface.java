package ies.puerto.modelo.fichero;

import java.util.List;

import ies.puerto.modelo.abstractas.Articulo;

public interface IFileInterface {
    public List<Articulo> lectura(String path, String articulo);
    public boolean escritura(String path, String contenido);
    public boolean eliminar(String path, String id);
    public boolean actualizar(String path, String id, String contenido);
}
