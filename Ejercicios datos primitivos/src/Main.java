public class Main {
  public static void main(String[] args) {
    // Punto 1
    float num1=20;
    float num2=20;
    float suma=num1+num2;
    float resta=num1-num2;
    float multiplicacion=num1*num2;
    float division=num1/num2;
    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicación es: "+multiplicacion);
    System.out.println("La división es: "+division);
    // Punto 2
    if(num1>num2){
      System.out.println("El numero mayor es: "+num1);
    } else if(num1<num2) {
      System.out.println("El numero menor es: "+num1);
    } else {
      System.out.println("Ambos numeros son iguales");
    }
    // Punto 3
    String nombre="Esteban";
    System.out.println("Bienvenido "+nombre);
    // Punto 4
    float base=3;
    float altura=6;
    float area=base*altura/2;
    System.out.println("El area del triangulo es: "+area);
    // Punto 5
    float precioProducto=10000;
    float iva=0.21f;
    float precioFinal=precioProducto+precioProducto*iva;
    System.out.println("El precio del producto con iva es: "+precioFinal);
  }
}