/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import archivos.Datos;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author emgl_
 */
public class ControlUsuarios {
    
    public static DefaultTableModel actualizarModelo(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Usuario");
        model.addColumn("Nombre");
	model.addColumn("Esp. Asignado(MB)");
	model.addColumn("Esp. Utilizado(MB)");
	model.addColumn("Admin");
        for(Usuario cadaUsuario:Datos.getListaUsuarios()) {
            String admin="No";
            if(cadaUsuario.isEsAdministrador()){
                admin="Sí";
            }	
            Object[] fila= {cadaUsuario.getUsuario(),cadaUsuario.getNombre(),cadaUsuario.getEspacioAsignado(),cadaUsuario.getEspacioUtilizado(),
	    admin};
	    model.addRow(fila);
	}
        return model;
    }
        
    public static boolean existeUsuario(String nombreUsuario){
        boolean existe=false;
        for (Usuario usuario: Datos.getListaUsuarios()) {
    		if (usuario.getUsuario().compareTo(nombreUsuario)==0)
        	existe=true;	
    	}
        return existe;
    }   
    
    public static boolean validarClave(String nombreUsuario, String clave){
        boolean igual=false;
        for (Usuario usuario: Datos.getListaUsuarios()) {
    		if (usuario.getUsuario().compareTo(nombreUsuario)==0&&usuario.getClave().compareTo(clave)==0){
                    igual=true;	
                }
    	}
        return igual;
    }  
    
    public static Usuario buscarUsuario(String nombreUsuario){
        Usuario usuario=new Usuario();
        for (Usuario cadaUsuario: Datos.getListaUsuarios()) {
    		if (cadaUsuario.getUsuario().compareTo(nombreUsuario)==0){
                    usuario=cadaUsuario;
                }
    	}
        return usuario;
    }
}
