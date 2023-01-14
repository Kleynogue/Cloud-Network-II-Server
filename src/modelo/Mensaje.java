/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author emgl_
 */
public class Mensaje implements Serializable{
    private static final long serialVersionUID = 6529685098267757690L;
    private int instruccion;
    /*
        1.- Validación de Usuario
        2.- Mostrar Archivos
        3.- Descargar Archivo
        4.- Subir Archivo
        5.- Crear carpeta
        6.- Eliminar archivo
    */
    private String nombreUsuario;
    private String clave;
    
    private String ipReceptor;

    public Mensaje() {
        this.instruccion = -1;
        this.nombreUsuario = "";
        this.clave = "";
    }
    
    public Mensaje(int instruccion, String nombreUsuario, String clave, File archivo) {
        this.instruccion = instruccion;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
    }

    public int getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(int instruccion) {
        this.instruccion = instruccion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
