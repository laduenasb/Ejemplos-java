import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
  private List<Tarea> lista = new ArrayList<>();
  public void agregarTareas(Tarea tarea){
    lista.add(tarea);
    System.out.println("Se agrego la tarea exitosamente");
  }
  public void marcarTareaCompletada(Tarea tarea){
    tarea.setEstado("Completada");
    System.out.println("Se marco la tarea como completada");
  }
  public void listarTareasPendientes(){
    List<Tarea> tareasPendientes = new ArrayList<>();
    System.out.println("La lista de tareas pendientes es: ");
    for(Tarea tarea: lista){
      if(tarea.getEstado().equals("Pendiente")){
        tareasPendientes.add(tarea);
        tarea.mostrarTarea();
      }
    }
  }
  public void listarTareas(){
    for(Tarea tarea: lista){
      tarea.mostrarTarea();
    }
  }
}
