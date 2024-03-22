package ies.puerto.config;

import java.io.FileInputStream;

import java.util.Properties;

public  class FicheroProperties {

    Properties propiedades;
    
    public FicheroProperties() {
        propiedades= new Properties();
    }

    public Properties obtenerPropiedades(){
        try  (FileInputStream fis = new FileInputStream("src/resources/datos.properties")){
            propiedades.load(fis);
        } catch (Exception e) {
            System.out.println("a");
        }
        return propiedades;
    }
}
