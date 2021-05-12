package one.digitalinnovation.list.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercício com List.
 *
 * @author Antônio Lima Jr
 * @created 11/05/2021 - 22:34
 * @project collections-course
 */
public class ListExer {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();

    // Criar uma lista e executar as Seguintes operações:
    // Adiciona 5 nomes
    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");

    // Navegue na lista exibindo cada nome
    nomes.forEach(System.out::println);
    System.out.println(nomes);

    // Substitua o nome Carlos por Roberto
    nomes.set(nomes.indexOf("Carlos"), "Roberto");
    System.out.println(nomes);

    // Retorne o Nome da posição 1
    String nomePosUm = nomes.get(1);
    System.out.println(nomePosUm);

    // Remova o nome da posição 4
    nomes.remove(4);
    System.out.println(nomes);

    // Remova o nome João
    nomes.remove("João");
    System.out.println(nomes);

    // Retorne a quantidade de item na lista
    System.out.println("Quantidade de items é: " + nomes.size());
    // Verifique se o nome juliano existe na lista
    boolean existeJuliana = nomes.contains("Juliano");
    System.out.println(existeJuliana);

    // Crie uma nova lista de nomes e adicione todos a lista nomes
    List<String> novaLista = new ArrayList<>();
    novaLista.add("Ismael");
    novaLista.add("Rodrigo");
    nomes.addAll(novaLista);
    System.out.println(nomes);

    // Ordene os item por ordem alfabética
    Collections.sort(nomes);
    System.out.println(nomes);

    // Verifique se lista esta vazia
    System.out.println(nomes.isEmpty());

  }
}
