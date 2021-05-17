package one.digitalinnovation.comparators;

import java.util.Comparator;

/**
 * Class Description.
 *
 * @author zucc
 * @created 14/05/2021 - 19:52
 * @project collections-course
 */
public class EstudanteOrdemIdadeReversaComparators implements Comparator<Estudante> {
  @Override
  public int compare(Estudante o1, Estudante o2) {
    return o1.getIdade() - o2.getIdade();
  }
}
