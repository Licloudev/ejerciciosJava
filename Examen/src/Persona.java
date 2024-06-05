public class Persona {
    /*
    * PROPIEDADES DEL OBJETO/CLASE
    * */
    private String nombre;
    private String apellidos;
    private int edad;

    /*
    * CONTRUCTORES
    * */

    // Constructor VACIO
    public Persona() {
    }

    // Contructor con parametros
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    /*
    * GETTERS AND SETTERS
    * */

    // Getters y Setter (Para obtener y modificar las propiedades del Objeto/Clase)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
