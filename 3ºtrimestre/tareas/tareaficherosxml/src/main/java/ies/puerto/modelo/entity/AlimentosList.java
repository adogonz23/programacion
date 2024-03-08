package ies.puerto.modelo.entity;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root (name ="alimentos")
public class AlimentosList {
    @ElementList(inline=true)
    private List<Alimento> alimentos;

    public List<Alimento> getAlimentos() {
        return alimentos;
    }
    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }
    public AlimentosList(){

    }   
    public AlimentosList(List<Alimento>alimentos){
        this.alimentos = alimentos;
    }
    
}
