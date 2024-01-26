import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    /* Ejercicio 1 */
    /*
    LocalDate fecha1 = LocalDate.of(2024,1,26);
    Tarea tarea1 = new Tarea("Hacer mercado", fecha1,"Pendiente");
    LocalDate fecha2 = LocalDate.of(2024,1,26);
    Tarea tarea2 = new Tarea("Sacar perro a pasear", fecha2, "Completada");
    LocalDate fecha3 = LocalDate.of(2024,1,27);
    Tarea tarea3 = new Tarea("Repasar temas programación", fecha3, "Pendiente");

    GestorTareas gestor = new GestorTareas();
    gestor.agregarTareas(tarea1);
    gestor.agregarTareas(tarea2);
    gestor.agregarTareas(tarea3);
    gestor.listarTareas();
    gestor.marcarTareaCompletada(tarea1);
    System.out.println();
    gestor.listarTareas();
    gestor.listarTareasPendientes();
     */

    /* Ejercicio 4 */
    Habitacion habitacion1 = new Habitacion(101,"VIP",50000,false);
    Habitacion habitacion2 = new Habitacion(102,"Normal",30000,false);
    Habitacion habitacion3 = new Habitacion(103,"Ejecutiva",40000,false);
    Hotel hotel_paspi = new Hotel("Alejandro");
    hotel_paspi.agregarHabitacion(habitacion1);
    hotel_paspi.agregarHabitacion(habitacion2);
    hotel_paspi.agregarHabitacion(habitacion3);
    hotel_paspi.verHabitaciones();
  }
}