package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Utilização do linkedHashSet.
 *
 * @author Antônio Lima Jr
 * @created 12/05/2021 - 21:25
 * @project collections-course
 */
public class MyLinkedHashSet {

  public static void main(String[] args) {
    LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

    // Adiciona os números no set
    sequenciaNumerica.add(16);
    sequenciaNumerica.add(2);
    sequenciaNumerica.add(8);
    sequenciaNumerica.add(4);
    sequenciaNumerica.add(1);

    System.out.println(sequenciaNumerica);

    // Remove o número do set
    sequenciaNumerica.remove(4);
    System.out.println(sequenciaNumerica);

    // Retorna a quantidade de items do set
    System.out.println(sequenciaNumerica.size());

    // Navega em todos os items do iterator
    Iterator<Integer> iterator = sequenciaNumerica.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (Integer numero : sequenciaNumerica) {
      System.out.println(numero);
    }

    // Retorna se o set está vazia ou não
    System.out.println(sequenciaNumerica.isEmpty());

    }
}
