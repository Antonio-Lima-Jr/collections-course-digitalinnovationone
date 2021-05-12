package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

/**
 * Utilização da interface Vector.
 *
 * @author Antônio Lima Jr
 * @created 11/05/2021 - 22:17
 * @project collections-course
 */
public class MyVectorExample {

  public static void main(String[] args) {
    List<String> esportes = new Vector<>();

    // Adiciona 4 esportes ao vetor
    esportes.add("Futebol");
    esportes.add("Basquetebol");
    esportes.add("Tênis de mesa");
    esportes.add("Handebol");

    // Altera o valor da posição 2 do vetor
    esportes.set(2, "Ping Pong");

    // Remove o esporte da posição
    esportes.remove(2);

    // Remove o Handebol do vetor
    esportes.remove("Handebol");

    // Retorna o primeiro item do vetor
    System.out.println(esportes.get(0));

    // Navega nos esportes
    for (String esporte : esportes) {
      System.out.println(esporte);
    }

  }
}
