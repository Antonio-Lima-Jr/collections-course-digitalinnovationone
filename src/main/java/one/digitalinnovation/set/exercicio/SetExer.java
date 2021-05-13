package one.digitalinnovation.set.exercicio;

import java.util.HashSet;
import java.util.Set;

/**
 * Exercício com Set.
 *
 * @author Antônio Lima Jr
 * @created 13/05/2021 - 06:54
 * @project collections-course
 */
public class SetExer {

  public static void main(String[] args) {

    Set<Integer> num = new HashSet<Integer>();

    // Adicione 5 números inteiros
    num.add(3);
    num.add(88);
    num.add(20);
    num.add(44);
    num.add(3);

    // Navegue no Set exibindo cada número no console
    num.forEach(System.out::println);

    // Remova o primeiro item do set
    num.remove(0);
    System.out.println(num);

    // Adicione um novo número no Set
    num.add(10);
    System.out.println(num);

    // Verifique o tamanho do Set
    System.out.println(num.size());

    // Verifique se o Set esta vazio
    System.out.println(num.isEmpty());

  }
}
