package one.digitalinnovation.optionals;

import java.util.Optional;

/**
 * Class Description.
 *
 * @author zucc
 * @created 17/05/2021 - 19:02
 * @project collections-course
 */
public class ExampleOptional {
  public static void main(String[] args) {

    Optional<String> optionalString = Optional.of("Valor Opcional");

    System.out.println("IsEmpty? -> " + optionalString.isEmpty());
    System.out.println("IsPresent? -> " + optionalString.isPresent());

    optionalString.ifPresent(System.out::println);

    optionalString.ifPresentOrElse(System.out::println,
        () -> System.out.println("Valor não está presente"));

    if(optionalString.isPresent()){
      String valor = optionalString.get();

      System.out.println(valor);
    }

    optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

    optionalString.orElseThrow(IllegalStateException::new);


  }

}
