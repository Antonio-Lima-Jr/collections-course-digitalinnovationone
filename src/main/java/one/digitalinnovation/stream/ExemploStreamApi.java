package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Class Description.
 *
 * @author zucc
 * @created 17/05/2021 - 19:35
 * @project collections-course
 */
public class ExemploStreamApi {
  public static void main(String[] args) {
    // Cria uma coleção de Estudantes
    List<String> estudante = new ArrayList<>();

    // Adiciona 4 estudantes para a coleção
    estudante.add("Pedro");
    estudante.add("Thayse");
    estudante.add("Marcelo");
    estudante.add("Carla");
    estudante.add("Juliana");
    estudante.add("Thiago");
    estudante.add("Rafael");

    // Retorna a contagem de elementos do stram
    System.out.println("Contagem: " + estudante.stream().count());

    // Retorna a elemento com maior numero de letras
    System.out.println("Maior numero de letras: " + estudante.stream().max(Comparator.comparingInt(String::length)));

    // Retorna a elemento com menor numero de letras
    System.out.println("Menor numero de letras: " + estudante.stream().min(Comparator.comparingInt(String::length)));

    // Retorna os elemento que tem a letrar R no nome
    System.out.println("Com a letra R no nome: " + estudante.stream().filter((estud) -> estud.toLowerCase().contains("r")).collect(Collectors.toList()));

    // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
    System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudante.stream().map(estud -> estud.concat(" - ").concat(String.valueOf(estud.length()))).collect(Collectors.toList()));

    // Retorna somente os tres primeiros elementos da coleção
    System.out.println("Retorna os tres primeiros elementos: " + estudante.stream().limit(3).collect(Collectors.toList()));

    // Exibe cada elemento no console e depois retorna a mesma coleção
    System.out.println("Retorna os elementos: " + estudante.stream().peek(System.out::println).collect(Collectors.toList()));

    // Exibe cada elemento no console sem retornar nova coleção
    System.out.println("Retorna os elementos novamente: ");
    estudante.stream().forEach(System.out::println);

    // Retorna true se todos os elementos possuem a letra W no nome;
    System.out.println("Todos os elementos contem o caractere W no nome " + estudante.stream().allMatch( elemento -> elemento.contains("W")));

    // Retorna true se tiver algum elementos que possuem a letra a minúscula no nome;
    System.out.println("Tem algum elemento com a minúscula no nome " + estudante.stream().anyMatch( elemento -> elemento.contains("a")));

    // Retorna true se nenhum elemento tiver a letra a minúscula no nome;
    System.out.println("Não tem nenhum elemento com a minúscula no nome " + estudante.stream().noneMatch( elemento -> elemento.contains("a")));

    // Retorna o primeiro elemento da coleção, se existir exibe no console
    System.out.println("Retorna o primeiro elemento da coleção");
    estudante.stream().findFirst().ifPresent(System.out::println);

    // Exemplo de operação encadeada
    System.out.println("Operação encadeada: ");
    System.out.println(estudante.stream()
        .peek(System.out::println)
        .map(estude -> estude.concat(" - ").concat(String.valueOf(estude.length())))
        .peek(System.out::println)
//        .filter(estude -> estude.toLowerCase().contains("r"))
//        .collect(Collectors.toList())
//        .collect(Collectors.joining(","))
//        .collect(Collectors.toSet())
          .collect(Collectors.groupingBy(estud -> estud.substring(estud.indexOf("-") + 2)))
    );



  }
}













