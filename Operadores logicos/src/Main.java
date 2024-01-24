import java.util.*;

public class Main {
  public static void main(String[] args) {
    /* Crear un programa donde le solicite un número al usuario y que me permita comprobar si el # es par o impar*/

    /*
    // Esta linea nos permite inicializar las peticiones por consola
    Scanner scan = new Scanner(System.in);
    // Solicitar el dato de entrada
    System.out.println("Ingrese un número para validar si es par o impar: ");
    // Necesitamos que el dato sea entero
    int numero = scan.nextInt();
    if(numero % 2 == 0){
      System.out.println("El número es par");
    } else {
      System.out.println("El número no es par");
    }
    */

    /* Verificar si una persona es mayor de edad y menor o igual a 60*/
    // Inicializar el dato
    /*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor digita tu edad");
    int edadHumano = scanner.nextInt();
    //int edadHumano = 18;
    // Utilizar un operador para evaluar las dos condiciones
    boolean esMayorDeEdad = edadHumano >= 18 && edadHumano <= 60;
    if (esMayorDeEdad) {
      System.out.println("La personas es mayor de edad y menor de 60");
    } else {
      System.out.println("La persona es menor de edad");
    }
     */
    /* Crear un programa que me determine si una persona es de género masculino */
    // Inicializar las peticiones por consola
    /*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el dato: ");
    char genero = scanner.next().charAt(0);
    if(genero == 'M' || genero == 'm') {
      System.out.println("El genero ingresado es masculino");
    } else if (genero == 'F' || genero == 'f') {
      System.out.println("El genero ingresado es femenino");
    } else {
      System.out.println("El valor ingresado es incorrecto");
    }
     */
    /* Crear un programa donde se solicita al usuario que ingrese un numero positivo */
    // Inicializar al usuario que ingrese por consola
    Scanner scanner = new Scanner(System.in);
    // Solicitar al usuario que ingrese un número
    System.out.println("Ingrese un número entero positivo: ");
    // La variable dato recibira los datos que se ingresen por consola
    int dato = scanner.nextInt();
    // Verificar si el número ingresado es positivo
    if(!(dato>0)){
      System.out.println("El numero ingresado no es positivo");
    } else {
      System.out.println("El numero ingresado si es positivo!!");
    }
  }
}