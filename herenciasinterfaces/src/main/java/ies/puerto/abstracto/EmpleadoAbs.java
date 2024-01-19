package ies.puerto.abstracto;

import ies.puerto.interfaz.ITrabajador;

public class EmpleadoAbs extends PersonaAbs implements ITrabajador {

    private float salario;
    private String trabajo;

    public EmpleadoAbs(String trabajo) {
        this.trabajo = trabajo;
    }
    public EmpleadoAbs(float salario) {
        this.salario = salario;
    }
    public EmpleadoAbs(float salario, String trabajo) {
        this.salario = salario;
        this.trabajo = trabajo;
    }
    public EmpleadoAbs(String nombre, String fechaNacimiento, float salario) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
    }
    public EmpleadoAbs(String nombre, String fechaNacimiento, String trabajo) {
        super(nombre, fechaNacimiento);
        this.trabajo = trabajo;
    }

    public EmpleadoAbs(String nombre, String fechaNacimiento, float salario, String trabajo) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
        this.trabajo = trabajo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String trabajar() {
        
        return null;
    }
    public void claculaSalario(){
        
    }
    @Override
    public String toString(){
        return "el empleado: "+getNombre()+" ,nacido el:"+getFechaNacimiento()+", que trabaja en: "+trabajo+" y tiene un sueldo de "+salario;
    }

}
