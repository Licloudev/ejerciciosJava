/**
 * 2. Cambia el programa anterior de tal forma que los datos de los
 *    gatos se introduzcan directamente en el código de la forma
 *    <code>gatito[2].setColor(“marrón”)</code> o bien mediante el
 *    constructor, de la forma <code>gatito[3] = new Gato("Garfeld",
 *    "naranja", "macho")</code>.
 *    <p>
 *    Muestra a continuación los datos de todos los gatos utilizando un
 *    bucle.
 * 
 *
 */
public class ArrayDeGatos02 {
  public static void main(String[] args) {
    GatoMascota[] gato = new GatoMascota[4];

    int i;

    gato[0] = new GatoMascota("Garfield", "naranja", "mestizo");
    gato[1] = new GatoMascota("Pepe", "gris", "angora");
    gato[2] = new GatoMascota("Mauri", "blanco", "manx");
    gato[3] = new GatoMascota("Ulises", "marrón", "persa");

    System.out.println("Datos de los gatos:");
    
    for (i = 0; i < 4; i++) {
      System.out.println("\nGato nº" + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
    }
  }
}

