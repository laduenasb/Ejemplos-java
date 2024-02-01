import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Instanciar la clase Animal
//    Animal animalGenerico = new Animal("Animal generico", "Animals Genericus",0);
//    Animal animalGenerico2 = new Animal();
//    animalGenerico.setNombreComun("Coco");
//    // Polimorfismo en tiempo de compilación
//    System.out.println(animalGenerico.comer("Concentrado"));
//    System.out.println(animalGenerico.comer("Beef",1000));

    Animal michifu = new Gato("Michifu",2);
    Animal leopardo = new Leopardo(5);

    ArrayList<Animal> arcaNoe = new ArrayList<>();
    arcaNoe.add(michifu);
    arcaNoe.add(leopardo);

    for(Animal animal: arcaNoe){
      System.out.println(animal.sonido());
    }
  }
}