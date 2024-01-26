public class Habitacion {
  private int numero_habitacion;
  private String tipo_habitacion;
  private double precio;
  private boolean reservada;

  public Habitacion(int numero_habitacion, String tipo_habitacion, double precio, boolean reservada) {
    this.numero_habitacion = numero_habitacion;
    this.tipo_habitacion = tipo_habitacion;
    this.precio = precio;
    this.reservada = reservada;
  }

  public void mostrarHabitacion(){
    System.out.println("Numero habitación: " +numero_habitacion);
    System.out.println("Tipo_habitacion: "+tipo_habitacion);
    System.out.println("Precio: "+precio);
    System.out.println("Reservada: "+((reservada)?"Si":"No"));
  }

  public int getNumero_habitacion() {
    return numero_habitacion;
  }

  public void setNumero_habitacion(int numero_habitacion) {
    this.numero_habitacion = numero_habitacion;
  }

  public String getTipo_habitacion() {
    return tipo_habitacion;
  }

  public void setTipo_habitacion(String tipo_habitacion) {
    this.tipo_habitacion = tipo_habitacion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public boolean isReservada() {
    return reservada;
  }

  public void setReservada(boolean reservada) {
    this.reservada = reservada;
  }
}
