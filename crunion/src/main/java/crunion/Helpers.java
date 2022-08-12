package crunion;

import java.io.*;
import org.json.JSONArray;
import org.json.JSONObject;

// Clase helpers con algunas utilidades reutilizables 
public class Helpers {

    // Metodo para validar si un numero esta entre dos valores
    public static boolean isBetween(float value, int min, int max) {
        return((value > min) && (value < max));
    }

    // Metodo para conseguir el siguiente ID de las conversiones
    public static int getNextConversionID(JSONArray array) {
        int idConversion = array.length() + 1;
        return idConversion;
    }

    // Metodo para agregar un objeto a un jsonArray y actualizar el Json file correspondiente
    public static void addToJson (JSONObject object, JSONArray array, String filepath) {
        try {
            array.put(object);

            FileWriter file = new FileWriter(filepath);
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);   
        }
    }

    // Metodo que solo actualiza un Json file con un array existente (sin agregar objetos)
    public static void sendToJsonFile (JSONArray array, String filepath) {
        try {
            FileWriter file = new FileWriter(filepath);
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);   
        }        
    }

    // Metodo revisa si un cliente se puede actualizar o eliminar basado en las conversiones historicas del mismo
    public static boolean checkClienteActualizable(String idCliente, JSONArray array)
    {
        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            if (object.getString("idCliente").equalsIgnoreCase(idCliente))
            {
                return false;
            }
        }

        return true;
    }
}