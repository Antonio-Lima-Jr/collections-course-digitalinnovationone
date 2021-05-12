package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Utilizando a Interface Queue.
 *
 * @author Antônio Lima Jr
 * @created 12/05/2021 - 09:05
 * @project collections-course
 */
public class MyQueueExample {
  public static void main(String[] args) {

    Queue<String> filaBanco = new LinkedList<>();
    filaBanco.add("Patricia");
    filaBanco.add("Roberto");
    filaBanco.add("Flávio");
    filaBanco.add("Pamela");
    filaBanco.add("Anderson");

    System.out.println("Fila do Banco: " + filaBanco);

    // Retorna e remove o primeiro elemento da fila
    String clienteAserAtendido = filaBanco.poll();
    System.out.println("Retornando e removendo o primeiro elemento da fila" + clienteAserAtendido);
    System.out.println("Fila do Banco: " + filaBanco);

    // Retorna o primeiro elemento da fila sem excluir o mesmo
    String primeiroElemento = filaBanco.peek();
    System.out.println("Retornando o primeiro elemento da fila" + primeiroElemento);
    System.out.println("Fila do Banco: " + filaBanco);

    // Limpa a lista e gera um erro no método element caso a lista esteja vazia
    // Nesse caso podemos usar o método peek que retorna null se a lista estiver vazia
    filaBanco.clear();
    try {
      String primeiroClienteOuErro = filaBanco.element();
    } catch (NoSuchElementException e) {
      e.printStackTrace();
    }
    String primeiroClienteOuNull = filaBanco.peek();
    System.out.println(primeiroClienteOuNull);

    // Navegação
    Queue<String> filaBanco2 = new LinkedList<>();
    filaBanco2.add("Patricia");
    filaBanco2.add("Roberto");
    filaBanco2.add("Flávio");
    filaBanco2.add("Pamela");
    filaBanco2.add("Anderson");

    // COm foreach
    for (String cliente : filaBanco2) {
      System.out.println("-:>" + cliente);
    }
    Iterator<String> iterator =  filaBanco2.iterator();
    // com While
    while (iterator.hasNext()){
      System.out.println("-->" + iterator.next());
    }

    // Tamanho da lista
    System.out.println(filaBanco2.size());
    // Verifica se a lista esta vazia
    System.out.println(filaBanco2.isEmpty());
  }
}
