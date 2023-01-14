/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Guardar {

    public static void enJSON() {
        Gson gson = new Gson();
        java.lang.reflect.Type listType = new TypeToken<ArrayList<Usuario>>() {}.getType();
        String json = gson.toJson(Datos.getListaUsuarios(), listType);
        
        
        try {
            try (FileWriter writer = new FileWriter("src/archivos/usuarios.json")) {
                writer.write(json);
            }
        } catch (IOException ex) {
            Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
