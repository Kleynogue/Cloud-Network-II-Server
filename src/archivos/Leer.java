/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author macmaug <maug.lucas@gmail.com>
 */
public class Leer {

    public static void deJSON() throws IOException {
        JSONArray jsonLista;
        JSONParser lectura = new JSONParser();
        try ( FileReader reader = new FileReader("src/archivos/usuarios.json")) {
            Object objetoLectura = lectura.parse(reader);
            jsonLista = (JSONArray) objetoLectura;
            //---------Lectura--------------
            //----------------------Odontólogo---------------------------
            for (int objeto = 0; objeto < jsonLista.size(); objeto++) {
                JSONObject usuarioJSON = new JSONObject();
                Usuario usuario = new Usuario();
                usuarioJSON = (JSONObject) jsonLista.get(objeto);
                //Agregar
                usuario.setNombre((String) usuarioJSON.get("nombre"));
                usuario.setEspacioAsignado(((double) usuarioJSON.get("espacioAsignado")));
                usuario.setEspacioUtilizado(((double) usuarioJSON.get("espacioUtilizado")));
                usuario.setClave((String) usuarioJSON.get("clave"));
                usuario.setUsuario((String) usuarioJSON.get("usuario"));
                usuario.setEsAdministrador((boolean) usuarioJSON.get("esAdministrador"));
                Datos.getListaUsuarios().add(usuario);
                
            }
            reader.close();       
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
