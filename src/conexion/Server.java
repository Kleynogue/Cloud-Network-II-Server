/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import modelo.Mensaje;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import archivos.Datos;

/**
 *
 * @author emgl_
 */
public class Server implements Runnable{

    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(Datos.getPuerto());
            Mensaje mensajeRecibido = new Mensaje();
            while(true){
                System.out.println("a la escucha...");
                Socket socket = servidor.accept();
                ObjectInputStream paqueteDatos = new ObjectInputStream(socket.getInputStream());
                mensajeRecibido = (Mensaje) paqueteDatos.readObject();
                System.out.println(mensajeRecibido.getNombreUsuario()+" "+mensajeRecibido.getClave()+" "+mensajeRecibido.getInstruccion());
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
