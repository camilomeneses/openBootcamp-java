public class Main {
  public static void main( String[] args ) {

    // Create and print fatherClass
    SmartDevice smartDevice = new SmartDevice();
    smartDevice.setColor( "Blue" );
    smartDevice.setTallCm( 7.0 );
    smartDevice.setWidthCm( 4.0 );
    smartDevice.setPriceDollar(350.5);
    System.out.println(smartDevice);

    // Create and print ChildrenClass SmartPhone
    SmartPhone smartPhone = new SmartPhone();
    smartPhone.setColor( "Red" );
    smartPhone.setTallCm( 8.0 );
    smartPhone.setWidthCm( 6.0 );
    smartPhone.setPriceDollar(400.0);
    System.out.println(smartPhone);

    // Create and print ChildrenClass SmartWatch
    SmartWatch smartWatch = new SmartWatch();
    smartWatch.setColor( "Black" );
    smartWatch.setTallCm( 10.0 );
    smartWatch.setWidthCm( 2.0 );
    smartWatch.setPriceDollar(200.0);
    System.out.println(smartWatch);
  }
}
