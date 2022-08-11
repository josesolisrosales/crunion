package crunion;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Helpers {

    public static boolean isBetween(float value, int min, int max) {
        return((value > min) && (value < max));
    }

    public static void agregarConversionToJson (String filepath, String monedaOrigen, String monedaDestino, float montoInicial, float montoFinal) {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader(filepath));
            JSONArray jsonArray = (JSONArray)obj;

            int idConversion = jsonArray.size() + 1;

            JSONObject conversion = new JSONObject();
            conversion.put("id", idConversion);
            conversion.put("monedaOrigen", monedaOrigen);
            conversion.put("monedaDestino", monedaDestino);
            conversion.put("montoInicial", montoInicial);
            conversion.put("montoFinal", montoFinal);

            jsonArray.add(conversion);

            FileWriter file = new FileWriter(filepath);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (ParseException | IOException ex) {
            java.util.logging.Logger.getLogger(CRUnion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}