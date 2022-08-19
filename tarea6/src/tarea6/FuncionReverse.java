package tarea6;

import java.util.Comparator;
import java.util.stream.Stream;

public class FuncionReverse {
  public static String reverse(String text){
    return new StringBuilder(text).reverse().toString();
  }
}
