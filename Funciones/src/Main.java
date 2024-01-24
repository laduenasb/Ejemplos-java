import java.util.Scanner;

public class Main {
  /* Función para calcular el área de un rectángulo  */
  public static double calcularRectangulo(double longitud, double ancho){
    return longitud*ancho;
  }
  /* Crear una función para verificar si un número es positivo, negativo o nulo*/
  public static String verificarSigno(int numero){
    if(numero>0) {
      return "Positivo";
    } else if (numero<0){
      return "Negativo";
    } else {
      return "Cero";
    }
  }
  /* Crear una función para obtener el máximo de tres números enteros */
  public static int obtenerMaximo(int a, int b, int c){
    int maximo = a;
    if(b>maximo){
      maximo=b;
    }
    if (c>maximo){
      maximo=c;
    }
    return maximo;
  }

  /* Crear uuna función para calcular la potencia de un numero */
  public static double calcularPotencia(double base, int exponente){
    double resultado=1.0;
    for(int i=0;i<exponente;i++){
      resultado *= base;
    }
    return resultado;
  }

  public static void main(String[] args) {
    double area = calcularRectangulo(5,3);
    System.out.println("El área del rectángulo es: "+area);
    int numero = -7;
    String resultadoSigno = verificarSigno(numero);
    System.out.println("El número "+numero+" es "+ resultadoSigno);
    int maximo = obtenerMaximo(10,7,16);
    System.out.println("El máximo de los tres números es: "+maximo);
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la base: ");
    double base = sc.nextDouble();
    System.out.println("Ingrese el valor del exponete: ");
    int exponenete = sc.nextInt();
    double potencia = calcularPotencia(base,exponenete);
    System.out.println(base + " elevado a la "+ exponenete + " es igual a: " + potencia);
  }
}