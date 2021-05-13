package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Utilizando HashMap.
 *
 * @author Antônio Lima Jr
 * @created 13/05/2021 - 07:31
 * @project collections-course
 */
public class MyHashMapExample {

  public static void main(String[] args) {

    Map<String, Integer> fifaChampions = new HashMap<>();

    // Adiciona os campeões mundiais fifa no Map
    fifaChampions.put("Brasil", 5);
    fifaChampions.put("Alemanha", 4);
    fifaChampions.put("Itália", 4);
    fifaChampions.put("Uruguai", 2);
    fifaChampions.put("Argentina", 2);
    fifaChampions.put("França", 2);
    fifaChampions.put("Inglaterra", 1);
    fifaChampions.put("Espanha", 1);

    System.out.println(fifaChampions);

    // Atualiza valor para chave Brasil
    fifaChampions.put("Brasil", 6);
    System.out.println(fifaChampions);

    // Retorna a Argentina
    System.out.println(fifaChampions.get("Argentina"));

    // Retorna se existe ou não um campeão França
    System.out.println(fifaChampions.containsKey("França"));

    // Remove o campeão França
    fifaChampions.remove("França");

    // Retorna se existe ou não um campeão França
    System.out.println(fifaChampions.containsKey("França"));

    // Retorna se existe ou não uma seleção hexa campeã
    System.out.println(fifaChampions.containsValue(6));

    // Retorna o tamanho do Map
    System.out.println(fifaChampions.size());
    System.out.println(fifaChampions);

    // Navega nos registros do mapa
    for (Map.Entry<String, Integer> entry : fifaChampions.entrySet()) {
      System.out.println(entry.getKey() + " == " + entry.getValue());
    }

    // Navega nos registros com menos performance
    for (String key : fifaChampions.keySet()) {
      System.out.println(key + " == " + fifaChampions.get(key));
    }

    System.out.println(fifaChampions);

    // Verifica se o mapa contem a chave Estados Unidos
    System.out.println(fifaChampions.containsKey("Estados Unidos"));

    // Verifica se o mapa contem o valor 5
    System.out.println(fifaChampions.containsValue(5));

    // Verifica o tamanho antes e depois de limpar o map
    System.out.println(fifaChampions.size());

    fifaChampions.clear();

    System.out.println(fifaChampions.size());

  }
}
