public class Libro {
  private String titulo;
  private String autor;
  private int anioPublicacion;

  public Libro() {
  }

  public Libro(String titulo, String autor, int anioPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
  }

  // Getters
  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnioPublicacion() {
    return anioPublicacion;
  }

  // Setters
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setAnioPublicacion(int anioPublicacion) {
    this.anioPublicacion = anioPublicacion;
  }

  public void mostrarDetalles() {
    System.out.println("El título del libro es: "+titulo);
    System.out.println("El nombre del autor es: "+autor);
    System.out.println("El año en que se público fue el: "+anioPublicacion);
  }
}
