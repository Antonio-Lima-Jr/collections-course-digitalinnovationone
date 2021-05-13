package one.digitalinnovation.map;

import com.sun.source.tree.Tree;
import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Utilizando TreeMap.
 *
 * @author Antônio Lima Jr
 * @created 13/05/2021 - 08:55
 * @project collections-course
 */
public class MyTreeMapExample {

  public static void main(String[] args) {

    TreeMap<String, String> treeCapitais = new TreeMap<>();

    // Monta a árvore com as capitais
    treeCapitais.put("RS", "Porto Alegre");
    treeCapitais.put("SC", "Florianópolis");
    treeCapitais.put("PR", "Curitiba");
    treeCapitais.put("SP", "São Paulo");
    treeCapitais.put("RJ", "Rio de Janeiro");
    treeCapitais.put("MG", "Belo Horizonte");
    System.out.println(treeCapitais);

    // Retorna a primeira capital no topo da árvore
    System.out.println(treeCapitais.firstKey());

    // Retorna a ultima capital no final da árvore
    System.out.println(treeCapitais.lastKey());

    // Retorna a primeira capital abaixo na árvore da capital parametrizada
    System.out.println(treeCapitais.lowerKey("SC"));

    // Retorna a primeira capital acima na árvore da capital parametrizada
    System.out.println(treeCapitais.higherKey("SC"));

    // Exibe todas as capitais no console
    System.out.println(treeCapitais);

    // Retorna a primeira capital no topo da árvore
    System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

    // Retorna a ultima capital no final da árvore
    System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

    Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
    Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

    System.out.println(treeCapitais);
    // Formas de navegação
    Iterator<String> iterator = treeCapitais.keySet().iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      System.out.println(key + " - " + treeCapitais.get(key));
    }

    for (String capital : treeCapitais.keySet()) {
      System.out.println(capital + " = " + treeCapitais.get(capital));
    }

    for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
      System.out.println(capital.getKey() + " = " + capital.getValue());
    }
  }
}
