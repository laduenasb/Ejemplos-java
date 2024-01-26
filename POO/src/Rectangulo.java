public class Rectangulo {
  private double largo;
  private double ancho;

  public Rectangulo(double largo, double ancho){
    this.ancho = ancho;
    this.largo = largo;
  }
  // Método para calcular el área del rectangulo
public double calcularArea(){
    return largo*ancho;
}
}
