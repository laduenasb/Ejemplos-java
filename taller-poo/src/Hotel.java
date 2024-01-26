import java.util.ArrayList;
import java.util.List;

public class Hotel {
  private String nombre_cliente;
  private double costo_total;
  private List<Habitacion> habitaciones = new ArrayList<>();

  public Hotel(String nombre_cliente) {
    this.nombre_cliente = nombre_cliente;
  }

  public void agregarHabitacion(Habitacion habitacion){
    habitaciones.add(habitacion);
  }

  public void reservarHabitacion(int numero_habitacion){
    for(Habitacion habitacion : habitaciones){
      if(!habitacion.isReservada()){
        habitacion.setReservada(true);
        System.out.println("Ha reservado la habitacion: "+numero_habitacion);
      }
    }
  }

  public void verHabitaciones(){
    for(Habitacion habitacion : habitaciones){
      habitacion.mostrarHabitacion();
    }
  }

  public String getNombre_cliente() {
    return nombre_cliente;
  }

  public void setNombre_cliente(String nombre_cliente) {
    this.nombre_cliente = nombre_cliente;
  }

  public double getCosto_total() {
    return costo_total;
  }

  public void setCosto_total(double costo_total) {
    this.costo_total = costo_total;
  }
}
