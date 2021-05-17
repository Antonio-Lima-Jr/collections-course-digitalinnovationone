package one.digitalinnovation.comparators;

/**
 * Utilizando Comparable.
 *
 * @author zucc
 * @created 14/05/2021 - 19:51
 * @project collections-course
 */
public class Estudante implements Comparable<Estudante> {

  private final String nome;
  private final Integer idade;

  public Estudante(String nome, Integer idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  @Override
  public String toString() {
    return "Estudante{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        '}';
  }

  @Override
  public int compareTo(Estudante estudante) {
    return this.getIdade() - estudante.getIdade();
  }
}
