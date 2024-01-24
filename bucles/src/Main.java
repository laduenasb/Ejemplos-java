import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {
  public static void main(String[] args) {
    /* Crear un programa que solicite al usuario que ingrese un elemento a buscar y que me valide si se encuentra o no*/

    // Inicializar la libreria para las peticiones por consola
    /*
    Scanner scan = new Scanner(System.in);
    // Solicitar al usuario que ingrese el tamaño del arreglo
    System.out.println("Ingrese el tamaño del array: ");
    int tamArray = scan.nextInt();
    // Crear un array de enteros con el tamaño especificado por el usuario
    int[] numbers = new int[tamArray];
    // Rellenar el array solicitando al usuario que ingrese valores para cada posición
    for(int i=0; i<numbers.length;i++){
      System.out.println("Ingrese el número para la posición "+ i + ": ");
      // Almacene el número ingresado al arreglo
      numbers[i] = scan.nextInt();
    }

    // Inicialiar una variable para indicar si el elemento fue encontrado o no
    boolean encontrado = false;
    System.out.println("Elemento a buscar: ");
    int elementoBuscado = scan.nextInt();
    // Inicializar un bucle para buscar el elemento en el array
    for(int i=0; i<numbers.length; i++){
      if(numbers[i] == elementoBuscado){
        encontrado = true;
        break;
      }
    }
     */
    /* Crear un programa que me permita calcular la suma de todos los elementos de un arreglo*/
    /*
    Scanner scanner = new Scanner(System.in);
    // Solicitar los datos de los elementos al usuario
    System.out.println("Ingrese la cantidad de números: ");
    // La variable cantidadNumeros estará recibiendo los datos obtenidos por consola
    int cantidadNumeros = scanner.nextInt();

    // Rellenar los datos dentro del array
    int[] numeros = new int[cantidadNumeros];
    // Inicializar la variable suma
    int suma = 0;
    // Inicializar la variable indice
    int i = 0;
    // Inicializar el bucle while para realizar el recorrido
    while(i<cantidadNumeros) {
     System.out.println("Ingrese el número: " + (i + 1) + ":");
     numeros[i] = scanner.nextInt();
     suma += numeros[i];
     // Que se autoincremente el indice en el array.
     i++;
    }
    // Imprimimos el total de la suma que se obtuvo del arreglo
    System.out.println("La suma de los datos es: " + suma);
     */
    /* Utilizando el bucle for-each, crea un programa para elevar al cuadrado cada elemento y que muestre el resultado por consola */
    /*
    int[] numbers = {2,4,6,8,10};
    System.out.println("Elementos del array elevado al cuadrado es: ");
    for(int numero : numbers){
      int cuadrado = numero * numero;
      System.out.println("El cuadrado de " + numero + " es: "+ cuadrado);
    }
     */
    /* Crear un programa para calcular la suma de números hasta que el usuario decida detener el bucle*/
    // Crear un objeto Scanner para la entrada de los datos
    Scanner sc = new Scanner(System.in);
    // Inicializar las variables para almacenar la suma y el número ingresado
    int suma = 0;
    int number;
    // Iniciar un bucle do-while que continuará ejecutandose hasta que el usuario ingrese un dato para detenerlo
    do {
      // Solicitar al usuario que ingrese un número
      System.out.println("Ingresa un número o el dato para detener el bucle: ");
      number = sc.nextInt();
      suma += number;
      // Continue el bucle si el número ingresado no es 0
    } while(number != 0);
    // Imprimir la suma total una vez que el usuario decida detener el bucle
    System.out.println("La sua total es: "+suma);
    // Cerrar las peticiones por consola que se realizan con el scanner
    sc.close();
  }
}