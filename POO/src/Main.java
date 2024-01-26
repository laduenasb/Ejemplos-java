import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /* Crear un programa que me permita recibir mediante OOP los nombres y las edades de las personas */
    Persona persona1 = new Persona("Juanita", 21);
    Persona persona2 = new Persona("Karina", 18);

    // Mostrar los datos de las personas
    persona1.mostrarInformacion();
    System.out.println();
    persona2.mostrarInformacion();
    /* Crear un programa que mediante los OOP me calcule el área de un rectángulo */
    Rectangulo rect = new Rectangulo(5,3);
    double area = rect.calcularArea();
    System.out.println("El área del rectángulo es de: "+area);

    /* Crear un programa usando los OOP para que me permita ejecutar y mostrar los datos y detalles de un libro */
    Libro miLibro = new Libro();

    miLibro.setTitulo("Java Programming");
    miLibro.setAutor("Manuel");
    miLibro.setAnioPublicacion(2024);
    System.out.println("Detalles del libro");
    miLibro.mostrarDetalles();

    /* Crear un programa que solicite y registre el nombre del estudiante, su edad, el nombre de la materia y la nota que obtuvo*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre del estudiante: ");
    String nombre = sc.nextLine();

    System.out.println("Ingrese la edad del estudiante: ");
    int edad = sc.nextInt();

    System.out.println("Ingrese el nombre de la materia: ");
    sc.nextLine();
    String materia = sc.nextLine();

    System.out.println("Ingrese la nota obtenida del estudiante: ");
    double notaObtenida = sc.nextDouble();

//    System.out.println(nombre);
//    System.out.println(edad);
//    System.out.println(materia);
//    System.out.println(notaObtenida);

    // Creamos el objeto estudiante para ingresar la información obtenida por consola
    Estudiante estudiante1 = new Estudiante(nombre, edad, materia, notaObtenida);
    // Mostrar la información del estudiante
    System.out.println("\nInformación del estudiante:");
    System.out.println("Nombre: " + estudiante1.getNombre());
    System.out.println("Edad: " + estudiante1.getEdad());
    System.out.println("Materia: " + estudiante1.getMateria());
    System.out.println("Nota: " + estudiante1.getNotaObtenida());

    sc.close();
  }
}