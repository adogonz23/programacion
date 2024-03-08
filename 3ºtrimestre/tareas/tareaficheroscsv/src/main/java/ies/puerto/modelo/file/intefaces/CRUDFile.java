package ies.puerto.modelo.file.intefaces;

import java.util.List;

import ies.puerto.modelo.entity.Alimento;

public interface CRUDFile {
    public List<Alimento>leerTodos(String path);
    public boolean escribir(String path, String Contenido);
    public boolean eliminar(String path, int id);
    public boolean actualizar(String path ,Alimento alimento);
}
