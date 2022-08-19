package tarea6;

import java.util.*;
import java.util.stream.IntStream;

import static tarea6.FuncionReverse.reverse;

public class Main {
  public static void main( String[] args ) {
    //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    String reverse = reverse("hola Mundo");
    System.out.println(reverse);
    //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    Integer[][] array = new Integer[][] {{1, 2, 3, 4},{5,6,7,8},{9,10,11,12}};
    Arrays.stream( array ).forEach( (row) -> Arrays.stream( row ).forEach( System.out::println ) );
    //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    Vector <String> names = new Vector<>(List.of("Camilo","Miguel","Julieta","Maria","Jonas"));
    names.remove( 1 );
    names.remove( 2 );
    System.out.println( "names = " + names );
    //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
    /* Respuesta: El Vector al exceder su capacidad, puede aumentar automaticamente en este caso yendo de 10 espacios disponibles
    hasta abastecer los 1000 espacios, claro que esto entre las redimensiones tomaría algo más de tiempo que un Array normal con
    un limite establecido */
    //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    ArrayList<String> elements = new ArrayList<>(List.of("element1", "element2", "element3","element4"));
    LinkedList<String> linkedElements = new LinkedList<>(elements);
    elements.forEach( System.out::println );
    linkedElements.forEach( System.out::println );
    //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
    List<Integer> numbers = new ArrayList<>();
    IntStream.rangeClosed( 1,10 ).forEach( numbers::add );
    System.out.println(numbers.stream().filter( number -> number % 2 != 0 ).toList());
  }
}
