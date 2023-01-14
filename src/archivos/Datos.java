/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author emgl_
 */
public class Datos {
    private static ArrayList<Usuario> listaUsuarios;
    private static ArrayList<Usuario> usuariosActivos;
    private static int puerto;
    
    public Datos() {
	Datos.listaUsuarios=new ArrayList<Usuario>();
        Datos.usuariosActivos=new ArrayList<Usuario>();
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        Datos.listaUsuarios = listaUsuarios;
    }

    public static ArrayList<Usuario> getUsuariosActivos() {
        return usuariosActivos;
    }

    public static int getPuerto() {
        return puerto;
    }

    public static void setPuerto(int puerto) {
        Datos.puerto = puerto;
    }
    
    public static void setUsuariosActivos(ArrayList<Usuario> usuariosActivos) {
        Datos.usuariosActivos = usuariosActivos;
    }
    
    public static void agregarUsuario(Usuario usuario){
        Datos.listaUsuarios.add(usuario);
    }
    
   
}
