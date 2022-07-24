import com.google.gson.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class laboratorioJson {
    public static int PRETTY_PRINT_IDENT_FACTOR= 4;
    public static String XML_STRING =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<menu_desayuno>\n" +
                    "<opcion>\n" +
                    "<nombre>PanCakes</nombre>\n" +
                    "<valor>$2.95</valor>\n" +
                    "<descripcion>Lithuanian Pancake Recipe - Blynai or Sklindziai\n" +
                    "</descripcion>\n" +
                    "<kcal>500</kcal>\n" +
                    "</opcion>\n" +
                    "<opcion>\n" +
                    "<nombre>Belgian Waffles</nombre>\n" +
                    "<valor>$5.95</valor>\n" +
                    "<descripcion>Two of our famous Belgian Waffles with plenty of real maple syrup</descripcion>\n" +
                    "<kcal>650</kcal>\n" +
                    "</opcion>\n" +
                    "<opcion>\n" +
                    "<nombre>Strawberry Belgian Waffles</nombre>\n" +
                    "<valor>$7.95</valor>\n" +
                    "<descripcion>\n" +
                    "Light Belgian waffles covered with strawberries and whipped cream\n" +
                    "</descripcion>\n" +
                    "<kcal>900</kcal>\n" +
                    "</opcion>\n" +
                    "</menu_desayuno>";


    public static void main(String[] args) {
        try {
            JSONObject jsonobject = XML.toJSONObject(XML_STRING);
            String jsonPretty = jsonobject.toString(PRETTY_PRINT_IDENT_FACTOR);
            System.out.println(jsonPretty);
            System.out.println(">>> Verificación de correcto funcionamiento ");
        } catch (JSONException jex){
            System.out.println(jex.toString());
        }
    }
}




