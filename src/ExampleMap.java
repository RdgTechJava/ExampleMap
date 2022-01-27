import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleMap {public static void main (String[] args){
    System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
    Map<String, Double> carrosPopulares = new HashMap<>(){{
        put("gol",14.4);
        put("uno",15.6);
        put("mobi",16.1);
        put("hb20",14.5);
        put("kwid",15.6);
    }};
    System.out.println(carrosPopulares.toString());

    System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
    carrosPopulares.put("gol",15.2);
    System.out.println(carrosPopulares);

    System.out.println("Confira se o modelo Tucson está no dicionário: "+ carrosPopulares.containsKey("Tucson"));

    System.out.println("Exiba o modelo  mais econômico e seu consumo: ");

    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";

    for (Map.Entry<String, Double> entry: entries) {
        if(entry.getValue().equals(consumoMaisEficiente)){
            modeloMaisEficiente=entry.getKey();
        }

    }

    System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente + " - " + consumoMaisEficiente);
}

}
