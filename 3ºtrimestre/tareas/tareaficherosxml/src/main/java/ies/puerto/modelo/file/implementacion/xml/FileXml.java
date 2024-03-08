package ies.puerto.modelo.file.implementacion.xml;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.file.intefaces.CRUDFile;

public class FileXml implements CRUDFile{
        @Element(name="alimentos")
        List<Alimento>alimentos;
        String RUTA_XML = "src/resources/alimentos.xml";
        @Override
        public List<Alimento> leerTodos(String path) {
        
        }
        @Override
        public boolean escribir(String path, String contenido) {
            
        }
        @Override
        public boolean eliminar(String path, int id) {
            
        }
        @Override
        public boolean actualizar(String path, Alimento alimento) {
            
        }


}
