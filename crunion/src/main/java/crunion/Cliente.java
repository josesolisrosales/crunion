package crunion;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Cliente {

    // public static int CargarClientes() {
        
    // }

    public static boolean RevisarClienteRepetido(String filepath, String id) {
        JSONParser jsonParser = new JSONParser();
        try {
            Object obj = jsonParser.parse(new FileReader(filepath));
            JSONArray jsonArray = (JSONArray)obj;

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject cliente = jsonArray.get;
                String idCliente = cliente.
                
            }
        } catch (ParseException | IOException ex) {
            java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static void AgregarClienteToJson(String filepath, String id, String nombre, String apellido, String nacionalidad, int edad) {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader(filepath));
            JSONArray jsonArray = (JSONArray)obj;

            JSONObject cliente = new JSONObject();
            cliente.put("id", id);
            cliente.put("nombre", nombre);
            cliente.put("apellido", apellido);
            cliente.put("nacionalidad", nacionalidad);
            cliente.put("edad", edad);

            jsonArray.add(cliente);

            FileWriter file = new FileWriter(filepath);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (ParseException | IOException ex) {
            java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private static String id;
    private static String nombre;
    private static String apellido;
    private static String nacionalidad;
    private static int edad;

}