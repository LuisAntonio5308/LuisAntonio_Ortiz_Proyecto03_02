/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoLAOV;

/**
 *
 * @author lo397
 */
public class Cliente {
    private int idCliente;
    private String Nombre;
    private int Edad;
    private String Correo;
    private String Telefono;
    
    public Cliente(){
    }

    public Cliente(int idCliente, String Nombre, int Edad, String Correo, String Telefono) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Correo=Correo;
        this.Telefono=Telefono;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCorreo() {
        return Correo;
    }
    
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
