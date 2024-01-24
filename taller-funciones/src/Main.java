import java.util.Scanner;

public class Main {
  /* Ejercicio 1*/
  public static int contarVocales(String texto){
    String vocales = "aeiou";
    int contar=0;
    for(int i=0;i<texto.length();i++){
      if(vocales.contains(Character.toString(texto.charAt(i)))){
        contar++;
      }
    }
    return contar;
  }

  /* Ejercicio 2*/
  public static String cadenaRevertida(String texto){
    String invertido="";
    for(int i=(texto.length()-1);i>=0;i--){
      invertido+=texto.charAt(i);
    }
    return invertido;
  }

  /*Ejercicio 3*/
  public static double notaFinal(double nota1, double nota2, double nota3){
    return (nota1+nota2+nota3)/3.0;
  }
  /*Ejercicio 4*/
  public static double celsiusToFahrenheit(double celsius){
    return (celsius)*9/5+32;
  }
  public static void main(String[] args) {
    /* Ejercicio 1 */
    /*
    System.out.println("Ingresa la palabra: ");
    Scanner sc = new Scanner(System.in);
    String palabra=sc.next();
    sc.close();
    System.out.println("La cantidad de vocales encontradas son: "+contarVocales(palabra));
     */
    /* Ejercicio 2*/
    /*
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la palabra: ");
    String texto=sc.next();
    sc.close();
    System.out.println("El texto ingresado al reves es: " +cadenaRevertida(texto));
     */
    /* Ejercicio 3 */
    /*
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la nota 1: ");
    double nota1 = sc.nextDouble();
    System.out.println("Ingresa la nota 2: ");
    double nota2 = sc.nextDouble();
    System.out.println("Ingresa la nota 3: ");
    double nota3 = sc.nextDouble();
    sc.close();
    System.out.println("El promedio de la nota final es: "+notaFinal(nota1,nota2,nota3));
     */
    /* Ejercicio 4 */
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa la temperatura en Fahrenheit: ");
    double celsius=sc.nextDouble();
    System.out.println("La temperatura es: "+celsiusToFahrenheit(celsius));

  }
}