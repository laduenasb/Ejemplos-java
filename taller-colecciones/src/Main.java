import java.util.*;

public class Main {
  public static void main(String[] args) {
    /*Ejercicio 1*/
    /*
    Set<String> estudiantes = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("1: Continuar");
      System.out.println("2: Salir");
      System.out.print("Opcion: ");
      opcion=sc.nextInt();
      if(opcion!=2){
        System.out.println("Ingresa un nombre: ");
        sc.nextLine();
        estudiantes.add(sc.nextLine());
      }
    } while(opcion!=2);
    sc.close();
    System.out.println("La lista de estudiantes es: ");
    System.out.println(estudiantes);
     */
    /* Ejercicio 2 */
    List<String> tareas = new ArrayList<>();
    String continuar;
    Scanner scanner = new Scanner(System.in);
    String pendiente;
    do {
      System.out.print("Ingrese una tarea pendiente: ");
      pendiente=scanner.nextLine();
      tareas.add(pendiente);
      System.out.println("Tarea agregada exitosamente");
      System.out.println("Desea continuar? si/fin");
      continuar=scanner.nextLine();
    } while(!continuar.equalsIgnoreCase("fin"));
    System.out.println("La lista de tareas pendientes es: ");
    for(int i=0;i<tareas.size();i++){
      System.out.println((i+1)+": "+tareas.get(i));
    }
  }
}