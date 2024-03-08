package ies.puerto.modelo.file.implementacion.xml;

import java.io.File;
import java.util.List;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.core.Persister;


import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.AlimentosList;
import ies.puerto.modelo.file.intefaces.CRUDFile;

public class FileXml implements CRUDFile{

        

        List<Alimento>alimentos;

        String RUTA_XML = "src/resources/alimentos.xml";
        
        @Override
        public List<Alimento> leerTodos(String path) {
                Persister serializer = new Persister();
                try {
                        File file =new File(RUTA_XML);
                        AlimentosList alimentosList = serializer.read(AlimentosList.class, file);
                        alimentos = alimentosList.getAlimentos();
                        return alimentos;
                } catch (Exception e) {
                        e.printStackTrace();
                }
                return  alimentos;
        }
        @Override
        public boolean escribir(String path, String contenido) {
                return false;
        }
        @Override
        public boolean eliminar(String path, int id) {
                return false;
        }
        @Override
        public boolean actualizar(String path, Alimento alimento) {
                return false;
        }


}
