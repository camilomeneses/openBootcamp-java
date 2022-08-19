public class SmartDevice {
  private Double tallCm;
  private Double widthCm;
  private String color;
  private Double priceDollar;

  public SmartDevice() {
  }

  public Double getTallCm() {
    return tallCm;
  }

  public void setTallCm( Double tallCm ) {
    this.tallCm = tallCm;
  }

  public Double getWidthCm() {
    return widthCm;
  }

  public void setWidthCm( Double widthCm ) {
    this.widthCm = widthCm;
  }

  public Double getPriceDollar() {
    return priceDollar;
  }

  public void setPriceDollar( Double priceDollar ) {
    this.priceDollar = priceDollar;
  }

  public String getColor() {
    return color;
  }

  public void setColor( String color ) {
    this.color = color;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder( this.getClass().getName() + "{" );
    sb.append( "tallCm=" ).append( tallCm );
    sb.append( ", widthCm=" ).append( widthCm );
    sb.append( ", color='" ).append( color ).append( '\'' );
    sb.append( ", priceDollar=" ).append( priceDollar );
    sb.append( '}' );
    return sb.toString();
  }
}
