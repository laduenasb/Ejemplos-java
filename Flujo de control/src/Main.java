import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    /* Escribe un programa que determine si un número ingresado por el usuario es positivo, negativo o nulo*/
    // Peticiones por consola
    /*
    Scanner scanner = new Scanner(System.in);
    // Solicitar el dato de entrada
    System.out.println("Ingrese un número");
    // Almacenar el dato ingresado en la variable numero
    int numero = scanner.nextInt();
    // Comprobar si el número es positivo, negativo o nulo.
    if(numero>0){
      System.out.println("El número es positivo");
    } else if(numero<0) {
      System.out.println("El número es negativo");
    } else {
      System.out.println("El número es cero");
    }
    */
    /*Crear un programa que me permita tomar números del 1 al 7 e imprima el día de la semana que le corresponde */
    /*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa el número del 1 al 7");
    int dia = scanner.nextInt();
    scanner.close();
    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sabado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Dia incorrecto");
    }
     */
    /* Crear un programa que le solicite al usuario ingresar un número y que me permita manejar excepciones si el usuario ingresa un dato de entrada no válido*/

    // Inicializar los datos por consola
    /*
    Scanner scanner = new Scanner(System.in);
    try{
      System.out.println("Ingrese un número entero: ");
      int num = scanner.nextInt();
      System.out.println("El número que se ingreso es: "+num);
    } catch (Exception e){
      System.out.println("Estas ingresando datos no válidos!!");
    }
     */
    /* Crear una expresión ternaria que me permita determinar si el número es par o impar */

    /*
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int entrada = scanner.nextInt();

    // Inicializar el operador ternario

    String resultado = (entrada %2 == 0 ) ? "El número es par" : "El número es impar";
    System.out.println(resultado);
    scanner.close();
    */
    /* Crear un programa que simule un juego de adivinanza. El programa debe generar aleatoriamento un número entre 1 y 10 que el usuario deberá intentar adivinar. Solamente se permitiran unicamente 3 intentos */
    Scanner scanner = new Scanner(System.in);
    // Instrucción que me permita ingresar números aleatorios
    Random random = new Random();
    // Generar un número aleatorio entre 1 y 10
    int numeroAdivinado=random.nextInt(10)+1;
    int intento;
    int intentosRealizados=0;
    // Esta variable variable nos permitirá ingresar la constante del número de intentos habilitados
    final int maxIntentos = 3;
    System.out.println("Bienvenido al juego de tu vida");
    System.out.println("Intentar adivinar un número entre 1 y 10");
    do {
      // Solicitar al usuario que ingrese un intento
      System.out.println("Ingresa tu intento: ");
      intento = scanner.nextInt();
      // Incrementar el contador de intentos
      intentosRealizados++;
      // Verificar si el intento es correcto
      if(intento == numeroAdivinado){
        System.out.println("!Felicidades master! Has adivinado el número en " + intentosRealizados+ " intentos");
      } else {
        System.out.println("Intento incorrecto, !Sigue intentandolo!");
      }
      // Mientras que el jugador no agote sus 3 intentos podrá seguir sin problema en el juego
    } while(intento != numeroAdivinado && intentosRealizados < maxIntentos);
    // Verificar si el usuario agotó sus intentos sin adivinar el número
    if(intento != numeroAdivinado){
      System.out.println("Lo siento, el número era: "+numeroAdivinado);
    }
    scanner.close();
  }
}
