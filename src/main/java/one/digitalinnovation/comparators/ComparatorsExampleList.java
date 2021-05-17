package one.digitalinnovation.comparators;

import java.util.*;

/**
 * Class Description.
 *
 * @author zucc
 * @created 14/05/2021 - 19:51
 * @project collections-course
 */
public class ComparatorsExampleList {
  public static void main(String[] args) {

    List<Estudante> estudantes = new ArrayList<>();

    estudantes.add(new Estudante("Pedro", 19));
    estudantes.add(new Estudante("Carlos", 23));
    estudantes.add(new Estudante("Mariana", 21));
    estudantes.add(new Estudante("João", 18));
    estudantes.add(new Estudante("Thiagp", 20));
    estudantes.add(new Estudante("George", 22));
    estudantes.add(new Estudante("Larissa", 21));

    System.out.println("--- ordem se inserção ---");
    System.out.println(estudantes);

    estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

    System.out.println("--- ordem natural dos números - idade ---");
    System.out.println(estudantes);

    estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

    System.out.println("--- Ordem reversa dos números - idade ---");
    System.out.println(estudantes);

    estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

    System.out.println("--- ordem natural dos números - idade (method reference) ---");
    System.out.println(estudantes);

    estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

    System.out.println("--- ordem reversa dos números - idade (method reference) ---");
    System.out.println(estudantes);

    Collections.sort(estudantes);

    System.out.println("--- ordem reversa dos números - idade (interface Comparable) ---");
    System.out.println(estudantes);

    Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparators());

    System.out.println("--- ordem reversa dos números - idade (interface Comparator) ---");
    System.out.println(estudantes);

  }

}
