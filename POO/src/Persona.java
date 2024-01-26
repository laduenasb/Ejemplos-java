public class Persona {
  // Inicialice los atributos de nuestra clase
  /* Se declara private los datos, para decir que solamente pueden ser accesibles y modificados dentro de la clase que lo inicializo */
  // ATRIBUTOS
  private String nombre;
  private int edad;

  // Inicializar los constructores para el nombre y la edad
  // CONSTRUCTORES
  public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }
  // METODOS
  public void mostrarInformacion(){
    System.out.println("Tu nombres es: "+nombre);
    System.out.println("Tu edad es: "+edad+" años");
  }
}
