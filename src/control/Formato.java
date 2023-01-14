/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author emgl_
 */
public class Formato {
    
    public static boolean validarClave(String clave){
        boolean valida = false;
        if(clave.length()>6){
            valida=true;
        }
        return valida;
    }
}
