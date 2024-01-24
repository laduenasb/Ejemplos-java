import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*Escribe un programa que use un bucle para imprimir los números del 1 al 10 en la consola.*/
//    for(int i=1;i<=10;i++){
//      System.out.println(i);
//    }
    /*Crea un programa que utilice un bucle para sumar todos los números pares del 1 al 20 e imprimir el resultado.*/
    /*
    int suma=0;
    for(int j=0;j<=20;j+=2){
      suma+=j;
      System.out.println(j);
    }
    System.out.println("La suma de los pares del 1 al 20 es: "+suma);
    */
    /*Desarrolla un bucle que solicite al usuario ingresar una serie de nombres hasta que decida finalizar, luego muestra la lista completa de nombres ingresados.*/
    /*
    String nombres="";
    Scanner sc = new Scanner(System.in);
    String nombre;
    do {
      System.out.println("Ingrese un nombre (salir): ");
      nombre=sc.nextLine();
      nombres+=nombre+"\n";
      System.out.println(nombre);
    } while(!nombre.equals("salir"));
    System.out.println(nombres);
    sc.close();
     */
    /*Implementa un bucle que recorra una cadena de texto y cuente la cantidad de vocales presentes en ella.*/
    String texto = "murcielago";
    Boolean es = !texto.equals("salir");
    int vocales = 0;
    for(int i=0;i<texto.length();i++){
      if(texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u'){
        vocales+=1;
      }
    }
    System.out.println("La cantidad de vocales son: "+vocales);
  }
}