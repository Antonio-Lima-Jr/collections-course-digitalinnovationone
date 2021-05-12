package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Utilização da interface List.
 *
 * @author Antônio Lima Jr
 * @created 11/05/2021 - 21:29
 * @project collections-course
 */
public class MyListExample {

  public static void main(String[] args) {
    List<String> nomes = new ArrayList<String>();

    nomes.add("Pedro");
    nomes.add("Rafaela");
    nomes.add("Carlos");
    nomes.add("Julia");
    nomes.add("Maria");
    nomes.add("João");

    System.out.println(nomes);

    Collections.sort(nomes); // Organizar por ordem alfabética

    System.out.println(nomes);

    nomes.set(2, "larissa"); // atualizamos determinada posição no array

    System.out.println(nomes);

    nomes.remove(4); // remove o elemento do índice 4

    System.out.println(nomes);

    String name = nomes.get(1); // retorna o elemento na posição 1 para a variável

    System.out.println(name);

    int posicao = nomes.indexOf("Maria"); // retorna o índice da posição do elemento informado

    System.out.println(posicao);

    int posicao2 = nomes.indexOf("Rodrigo"); // retorna -1 para um índice não encontrado no array

    System.out.println(posicao2);

    int tamanho = nomes.size(); // retorna a quantidade de elementos na lista

    System.out.println(tamanho);

    nomes.remove(0);
    int tamanho2 = nomes.size(); // retorna a quantidade de elementos na lista

    System.out.println(tamanho2);

    boolean contemAnderson = nomes.contains("João"); // verifica na lista se existe esta String

    System.out.println(contemAnderson);

    boolean listaEstaVazia = nomes.isEmpty(); // verifica se a lista esta vazia

    System.out.println(listaEstaVazia);

    // Navegação nos arrays
    for (String nome : nomes) {
      System.out.println("-> " + nome);
    }

    Iterator<String> iterator = nomes.iterator();

    while (iterator.hasNext()) { // hasnext retorna um booleano se existe mais um elemento no array
      // retorna o elemento incrementa 1 no seu contador interno
      System.out.println("---> " + iterator.next());
    }

    nomes.clear(); // limpa todos os elementos da lista
    boolean listaEstaVazia2 = nomes.isEmpty();

    System.out.println(listaEstaVazia2);

  }
}
