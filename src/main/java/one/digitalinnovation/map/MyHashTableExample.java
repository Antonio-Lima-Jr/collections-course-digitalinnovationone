package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * Utilizando HashTable.
 *
 * @author Antônio Lima Jr
 * @created 13/05/2021 - 09:18
 * @project collections-course
 */
public class MyHashTableExample {

  public static void main(String[] args) {

    Hashtable<String, Integer> estudantes = new Hashtable<>();

    estudantes.put("Carlos", 23);
    estudantes.put("Mariana", 33);
    estudantes.put("Rafaela", 18);
    estudantes.put("Pedro", 44);

    System.out.println(estudantes);

    estudantes.put("Pedro", 55);

    System.out.println(estudantes);

    // Remover
    estudantes.remove("Pedro");
    System.out.println(estudantes);

    // Retornar um estudante no índice 2
    int idadeEstudante = estudantes.get("Mariana");
    System.out.println(idadeEstudante);
    System.out.println(estudantes.size());

    // Navega nos registros
    for (Map.Entry<String, Integer> entry : estudantes.entrySet()) {
      System.out.println(entry.getKey() + " -- " + entry.getValue());
    }

    // Navega nos registros
    for (String key : estudantes.keySet()) {
      System.out.println(key + " --> " + estudantes.get(key));
    }
  }
}
