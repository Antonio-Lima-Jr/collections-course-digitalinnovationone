package one.digitalinnovation.optionals;

import java.util.Optional;

/**
 * Class Description.
 *
 * @author zucc
 * @created 17/05/2021 - 18:35
 * @project collections-course
 */
public class MyOptionalsExample {

  public static void main(String[] args) {

    Optional<String> optionalString = Optional.of("Valor Presents");
    System.out.println("Valor opcional que esta presente");
    optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("Não esta presente"));

    // Se tiver a chance do objeto vir null devemos usar o Optional.ofNullable
    Optional<String> optionalNull = Optional.ofNullable(null);
    System.out.println("Valor Opcional que não está presente");
    optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não esta presente"));

    Optional<String> emptyOptional = Optional.empty();
    System.out.println("Valor Opcional que não está presente");
    emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não esta presente"));
try {
  Optional<String> optionsNullError = Optional.of(null);
  System.out.println("Valor Opcional que lança erro NullPointerException");
  emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não esta presente"));
}catch (Exception e){
  e.printStackTrace();
}



  }
}
