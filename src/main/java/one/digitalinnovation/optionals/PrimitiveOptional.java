package one.digitalinnovation.optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Class Description.
 *
 * @author zucc
 * @created 17/05/2021 - 18:57
 * @project collections-course
 */
public class PrimitiveOptional {
  public static void main(String[] args) {

    System.out.println("*** Valor inteiro opcional");
    OptionalInt.of(12).ifPresent(System.out::println);

    System.out.println("*** Valor inteiro opcional");
    OptionalDouble.of(55.2).ifPresent(System.out::println);

    System.out.println("*** Valor inteiro opcional");
    OptionalLong.of(23L).ifPresent(System.out::println);

  }

}
