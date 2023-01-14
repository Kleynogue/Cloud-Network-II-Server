/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;


/**
 *
 * @author emgl_
 */
public class Cliente {
    private static DataOutputStream dataOutputStream;
    private static DataInputStream dataInputStream;
    
    public static void enviarArchivo(String rutaEnvio, String ipServidor, int puerto) {
        // Create Client Socket connect to port "puerto"
        try (Socket socket = new Socket(ipServidor, puerto)) {
            Cliente.dataInputStream = new DataInputStream(socket.getInputStream());
            Cliente.dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Enviando el archivo al servidor " + ipServidor + "..");
            // Call SendFile Method
            sendFile(rutaEnvio);

            dataInputStream.close();
            dataInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void enviarInstruccion(String instruccion, String ipServidor, int puerto){
        try (Socket s = new Socket(ipServidor,puerto)){           
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(instruccion);
            dout.flush();
            dout.close();
            s.close();
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    // sendFile function define here
    private static void sendFile(String path) throws Exception {
        int bytes = 0;
        // Open the File where he located in your pc
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        // Here we send the File to Server
        Cliente.dataOutputStream.writeLong(file.length());
        // Here we break file into chunks
        byte[] buffer = new byte[4 * 1024];
        while ((bytes = fileInputStream.read(buffer)) != -1) {
            // Send the file to Server Socket
            Cliente.dataOutputStream.write(buffer, 0, bytes);
            Cliente.dataOutputStream.flush();
        }
        // close the file here
        fileInputStream.close();
    }
}
