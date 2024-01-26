import java.time.LocalDate;
import java.util.Date;

public class Tarea {
  private String descripcion;
  private LocalDate fecha_vencimiento;
  private String estado;

  public Tarea(String descripcion, LocalDate fecha_vencimiento, String estado){
    this.descripcion = descripcion;
    this.fecha_vencimiento = fecha_vencimiento;
    this.estado = estado;
  }

  public void mostrarTarea(){
    System.out.println("Descripción: "+descripcion);
    System.out.println("Fecha de vencimiento: "+fecha_vencimiento);
    System.out.println("Estado: "+estado);
    System.out.println();
  }
  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public LocalDate getFecha_vencimiento() {
    return fecha_vencimiento;
  }

  public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
    this.fecha_vencimiento = fecha_vencimiento;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}
