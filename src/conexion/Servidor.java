/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author emgl_
 */
public class Servidor {
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;
    
    public static String[] recibirInstruccion(int puerto){
        String str[]=new String[2];
        try (
            ServerSocket ss = new ServerSocket(puerto)){ 
            Socket s = ss.accept();//Establece conexion
            DataInputStream dis = new DataInputStream(s.getInputStream());
            str[0]= (String) dis.readUTF();
            str[1]= s.getInetAddress().getHostAddress();
            ss.close();
            
            return str;
        } catch (Exception e) {
            System.out.println(e);
        }
        return str;
    }

    public static void iniciarServidor(int puerto, String rutaGuardado, String ipCliente) {
        // Here we define Server Socket running on port "puerto"
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            
            
            
            System.out.println("El servidor esta conectando con el puerto " + puerto);
            // Accept the Client request using accept method
            Socket clientSocket = serverSocket.accept();
            if(clientSocket.getInetAddress().getHostAddress().equals(ipCliente)){
            System.out.println("Servidor conectado");
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            // Here we call receiveFile define new for that file
            receiveFile(rutaGuardado);

            dataInputStream.close();
            dataOutputStream.close();
            clientSocket.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // receive file function is start here
    private static void receiveFile(String fileName) throws Exception {
        int bytes = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        long size = dataInputStream.readLong(); // read file size
        byte[] buffer = new byte[4 * 1024];
        while (size > 0 && (bytes = dataInputStream.read(buffer, 0, (int)Math.min(buffer.length, size))) != -1) {
                // Here we write the file using write method
                fileOutputStream.write(buffer, 0, bytes);
                size -= bytes; // read upto file size
        }
        // Here we received file
        System.out.println("El archivo " + fileName + " fue recibido exitosamente");
        fileOutputStream.close();
    }
    
    
}
