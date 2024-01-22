/* Importa todos los paquetes que el proyecto necesita para ejecutarse*/
import org.w3c.dom.ls.LSOutput;

import java.util.*;

/* Java usa clases para poder ejecutar el código*/
public class Main {
  /* Modificadores de acceso en Java
   * El método principal de Java */
  public static void main(String[] args) {
    // Inicializar un ejercicio de enteros
    int numero1 = 5;
    int numero2 = 10;
    // Inicializar el proceso
    int suma = numero1 + numero2;
    numero1 += 3;
    // Mostrar la impresión del total de la operación
    System.out.println("La suma es es: " + suma);
    /* Ejercicio de decimales*/
    double radio = 5.0;
    // Inicializar el proceso
    double area = Math.PI * Math.pow(radio, 2);
    // Impresión por consola
    System.out.println("El área del círculo es: " + area);

    /* Ejercico de caracteres */
    char letra = 'A';
    System.out.println("La letra que se está recibiendo es: " + letra);

    /* Ejercicio de Booleanos*/
    int num1 = 7;
    int num2 = 7;

    boolean sonIguales = (num1 == num2);
    System.out.println("¿Son iguales?" + sonIguales);

    /* Ejercicio para cadenas (String) */
    String cadena1 = "Bienvenidos al: ";
    String cadena2 = "Desarrollo Backend en Java!!";
    String resultado = cadena1 + cadena2;
    System.out.println(resultado);

    /* Ejemplo de condicional*/
    int edad =19;
    if(edad>=18){
      System.out.println("Eres mayor de 18 años");
    } else {
      System.out.println("Eres menor de edad, no puedes ingresar");
    }
    boolean esMayor = (edad>=18) ? true: false;
    System.out.println(esMayor);
  }
}