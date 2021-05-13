package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Utilização da interface Set.
 *
 * @author Antônio Lima Jr
 * @created 12/05/2021 - 20:55
 * @project collections-course
 */
public class MySetExample {

  public static void main(String[] args) {

    Set<Double> notasAlunos = new HashSet<>();

    // Adiciona as notas no set
    notasAlunos.add(5.0);
    notasAlunos.add(6.7);
    notasAlunos.add(8.0);
    notasAlunos.add(4.3);
    notasAlunos.add(7.1);
    notasAlunos.add(9.0);
    notasAlunos.add(6.9);

    System.out.println(notasAlunos);

    // Remove a nota do set
    notasAlunos.remove(6.9);
    System.out.println(notasAlunos);

    // Retorna a quantidade de itens de set
    System.out.println(notasAlunos.size());

    // Navegar em todos os items com o Iterator
    Iterator<Double> iterator = notasAlunos.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (Double nota : notasAlunos) {
      System.out.println(nota);
    }

    // Limpa e verifica se esta vazio
    notasAlunos.clear();
    System.out.println(notasAlunos.isEmpty());
  }
}
