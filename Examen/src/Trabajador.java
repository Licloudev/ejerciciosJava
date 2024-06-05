public class Trabajador extends Persona{ // El Trabajador HEREDA las propiedades y metodos de Persona
    /*
     * PROPIEDADES DEL OBJETO/CLASE
     * */
    private String oficio;

    /*
     * CONTRUCTORES
     * */
    public Trabajador() {
    }
    public Trabajador(String oficio) {
        this.oficio = oficio;
    }

    // ESTE CONTRUCTOR ES ESPECIAL PORQUE TAMBIEN TIENE LAS PROPIEDADES DEL PADRE (Persona)
    public Trabajador(String nombre, String apellidos, int edad, String oficio) {
        super(nombre, apellidos, edad);
        this.oficio = oficio;
    }

    /*
     * GETTERS AND SETTERS
     * */

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }
}
