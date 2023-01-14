/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import archivos.Datos;
import archivos.Leer;
import conexion.Cliente;
import gui.Login;
import java.io.IOException;
import java.net.UnknownHostException;
import conexion.Server;

/**
 *
 * @author emgl_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        Cliente cliente=new Cliente();
        Datos datos = new Datos();
        Leer.deJSON();
        Datos.setPuerto(7896);
        Login inicio = new Login();
        inicio.setVisible(true);
    }   
}
