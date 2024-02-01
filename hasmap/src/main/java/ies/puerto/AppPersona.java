package ies.puerto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {
    static HashMap<String,Persona>personaHashMap;
    static List<Persona>personaList;
    public static void main(String[] args) {
        
        personaHashMap =new HashMap<>();
        personaList = new ArrayList<>();

    }
    public static boolean addPersonaLista(Persona persona){
        if (!existePersonalista(persona)) {
            return personaList.add(persona);
        }
        return true;
    }
    public static boolean addPersonaHashMap(Persona persona){
        if (!existePersonaMapa(persona)) {
            personaHashMap.put(persona.getDni(),persona);
        }
        return true;
    }
    public static boolean existePersonalista(Persona persona){
        if (personaList.isEmpty() || personaList == null) {
            return false;
        }
        if (!personaList.contains(persona)) {
            return false;
        }
        return true;
    }
    public static boolean existePersonaMapa(Persona persona){
            if (personaHashMap == null || personaHashMap.isEmpty() ) {
                return false;
            }
            if (!personaHashMap.containsKey(persona.getDni())) {
                return false;
            }
        return true;
    }
}
