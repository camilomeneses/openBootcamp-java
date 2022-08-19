import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class TareaStringConcat {
  public static void main( String[] args ) {
    String[] nombres = {"Camilo","Daniel","Manuel"};
    String result = Stream.of( nombres ).reduce( ( acc, value ) -> acc + value ).get();
    System.out.println( "result = " + result );
  }
}
