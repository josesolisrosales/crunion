package crunion;

import org.json.JSONArray;
import org.json.JSONObject;

public class Cliente {

    public static void addCliente(String id, String nombre, String apellido, String nacionalidad, int edad, JSONArray array, String filepath) {
        JSONObject cliente = new JSONObject();
        cliente.put("id", id);
        cliente.put("nombre", nombre);
        cliente.put("apellido", apellido);
        cliente.put("nacionalidad", nacionalidad);
        cliente.put("edad", edad);

        Helpers.addToJson(cliente, array, filepath);
    }

    public static void updateCliente(String id, String nombre, String apellido, String nacionalidad, int edad, JSONArray array, String filepath) {

        for (int i = 0; i < array.length(); i++) {
            JSONObject cliente = array.getJSONObject(i);
            if (cliente.getString("id").equalsIgnoreCase(id))
            {
                cliente.put("nombre", nombre);
                cliente.put("apellido", apellido);
                cliente.put("nacionalidad", nacionalidad);
                cliente.put("edad", edad);
            }
        }

        Helpers.sendToJsonFile(array, filepath);

    }

    public static void deleteCliente(String id, JSONArray array, String filepath) {
        for (int i = 0; i < array.length(); i++) {
            JSONObject cliente = array.getJSONObject(i);
            if (cliente.getString("id").equalsIgnoreCase(id))
            {
                array.remove(i);
            }
        }

        Helpers.sendToJsonFile(array, filepath);
    }

    public static String[] getClientesID(JSONArray array) {
        String[] idClientesStrings = new String[array.length()];

        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            idClientesStrings[i] = object.getString("id");
        }

        return idClientesStrings;
    }

    public static boolean checkClienteRepetido(String id, JSONArray array) {

        for (int i = 0; i < array.length(); i++) {
            JSONObject object = array.getJSONObject(i);
            if (object.getString("id").equalsIgnoreCase(id))
            {
                return true;
            }
        }

        return false;
    }

    private static String id;
    private static String nombre;
    private static String apellido;
    private static String nacionalidad;
    private static int edad;

}