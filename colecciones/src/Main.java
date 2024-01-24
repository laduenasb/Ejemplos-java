import java.util.*;

public class Main {
  public static void main(String[] args) {
    /* Crear una lista de cadenas de texto que represente los nombres de personas
     * Realizar operaciones de agregar, eliminar y mostrar datos de la lista */
    // Crear una lista de nombres de personas
    List<String>  lista = new ArrayList<>();
    // Agregar los nombres a la lista
    lista.add("Alex");
    lista.add("Julián");
    lista.add("Sergio");
    lista.add("Ximena");
    // Mostrar la lista de los nombres que se agregaron al array
    System.out.println("La lista de nombres es: "+lista);
    // Eliminar el nombre de un usuario
    lista.remove("Alex");
    // Mostrar la lista actualizada
    System.out.println("Esta es la lista de usuarios, despues de actualizarse"+lista);
    /* Crear un programa que me mapee una asociación de meses con números y que muestre los meses en el orden que fueron insertados */
    // Crear un Map para los meses con su indicativo
    Map<String, Integer> meses = new LinkedHashMap<>();
    // Agregar meses al HashMap
    meses.put("Enero", 1);
    meses.put("Febrero", 2);
    meses.put("Marzo", 3);
    meses.put("Abril", 4);

    // Mostrar los meses en el orden de inseción
    System.out.println("Meses en el orden de inserción es: " + meses.keySet());
    System.out.println(meses.values());
    /* Crear un conjunto de números enteros y que realicé operaciones de agregar, eliminar y mostrar*/
    // Crear un conjunto de números
    Set<Integer> numbers = new HashSet<>();
    // Agregar elementos a numbers
    numbers.add(10);
    numbers.add(5);
    numbers.add(9);
    numbers.add(-9);

    // Mostrar el contenido del conjuntos
    System.out.println("El conjunto de números es: "+numbers);
    // Eliminar un elemento del conjunto
    numbers.remove(9);
    System.out.println(numbers);
  }
}