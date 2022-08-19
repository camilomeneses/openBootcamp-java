public class TareaFuncion {
  private static final Double IVA = 1.19;

  public static void main( String[] args ) {
    Double price = 100.0;
    Double priceWithIVA = getPrice( price );
    System.out.println( "priceWithIVA = " + priceWithIVA );
  }

  public static Double getPrice( Double precio ) {
    return precio * IVA;
  }
}
