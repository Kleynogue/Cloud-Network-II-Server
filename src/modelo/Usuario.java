/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emgl_
 */
public class Usuario {
    private String nombre;
    private String usuario;
    private String clave;
    private String ruta;
    private double espacioUtilizado;
    private double espacioAsignado;
    private boolean esAdministrador;
    
    
    public Usuario(){
        this.nombre="";
        this.usuario="";
        this.clave="";
        this.ruta="";
        this.espacioUtilizado=0;
        this.espacioAsignado=50;
        this.esAdministrador=false;
    }
    
    public Usuario(String nombre, String usuario, String clave, String ruta, double espacioUtilizado, double espacioAsignado, boolean esAdministrador){
        this.nombre=nombre;
        this.usuario=usuario;
        this.clave=clave;
        this.ruta=ruta;
        this.espacioUtilizado=espacioUtilizado;
        this.espacioAsignado=espacioAsignado;
        this.esAdministrador=esAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getEspacioUtilizado() {
        return espacioUtilizado;
    }

    public void setEspacioUtilizado(double espacioUtilizado) {
        this.espacioUtilizado = espacioUtilizado;
    }

    public double getEspacioAsignado() {
        return espacioAsignado;
    }

    public void setEspacioAsignado(double espacioAsignado) {
        this.espacioAsignado = espacioAsignado;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }

    public void setEsAdministrador(boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }
    
    
    
}
