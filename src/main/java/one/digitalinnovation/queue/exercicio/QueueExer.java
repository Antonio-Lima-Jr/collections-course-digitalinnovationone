package one.digitalinnovation.queue.exercicio;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Exercício com Queue.
 *
 * @author Antônio Lima Jr
 * @created 12/05/2021 - 11:57
 * @project collections-course
 */
public class QueueExer {
  public static void main(String[] args) {

    // Adicione 5 nomes na lista
    Queue<String> nomes = new LinkedList<>();
    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");

    // Retorne todos os items da fila
    nomes.forEach(System.out::println);

    // Retorne o primeiro item da fila sem excluir
    System.out.println(nomes.peek());

    //Retorne o primeiro item removendo o mesmo
    System.out.println(nomes.poll());

    // Adicione um novo nome: Daniel, verifique a posição que o mesmo assumiu na fila
    nomes.add("Daniel");
    System.out.println(((LinkedList<String>) nomes).indexOf("Daniel"));

    // Rertorne o tamanho da fila
    System.out.println(nomes.size());

    // Verifique se a lista esta vazia
    System.out.println(nomes.isEmpty());

    // Verifique se o nome Carlos esta na lista
    System.out.println(nomes.contains("Carlos"));

  }
}
