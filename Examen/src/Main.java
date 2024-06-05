import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String variableFuera = "Esto es una variable fuera del MAIN que desde cualquier metodo puedes acceder.";
    public static void main(String[] args) {

        // if , else if , else
        condicionales();

        // for , while
        bucles();

        // arrayList
        listas();

        // obtener y mostrar datos , asignar datos , recorrer listas de objetos
        objetos();

        // crear metodos , pasar parametros al metodo , devolver en el metodo
        metodos();

        // con Scanner pedir datos , limpiar buffer
        pedirDatos();

        // Ejemplo llamar a variable fuera (creada arriba) para poder saber el valor
        String variableFuera1 = variableFuera;

    }

    /*
    * TIPS Y CONSEJOS
    * 1.- Para poder llamar desde el main a otro metodo fuera se tiene que añadir el *static* al metodo   EJ. condicionales()
    * 2.- Cuidado con eliminar de la lista mientras la estas recorriendo.
    * 3.- Si pides en Scanner un numero tendras que hacer try/catch por si ponen una letra.
    *
    *
    *
    * */




    private static void condicionales(){
        System.out.println("** CONDICIONALES **");

        comprobarNombreString();
        comprobarNumeroMayor();
        condicionalConVariasComprobaciones();
    }

    private static void comprobarNombreString() {
        /* Vamos a comprobar que dependiendo del nombre mostraremos una cosa u otra. */

        // Creamos una variable
        String nombre = "Claudio";

        // Si la variable contiene Jorge pintaremos ... Si es claudio entonces ... y al final el resto
        if(nombre == "Jorge"){

            System.out.println("Hola JORGE");

        } else if(nombre == "Claudio"){

            System.out.println("Hola CLAUDIO");

        } else if(nombre == "Thai") {

            System.out.println("Hola THAI");

        } else {
            System.out.println("Hola al RESTO");
        }
    }

    private static void comprobarNumeroMayor(){
        /* Vamos a comprobar si un numero es mayor que otro */
        int numero1 = 100;
        int numero2 = 200;

        // Si numero 1 (100) es mayor que numero 2 (200) NO SE VA A CUMPLIR
        if(numero1 > numero2){//100 > 200
            System.out.println("El numero 1 es MAYOR que el 2");

        } else if (numero1 < numero2) {//100 < 200
            System.out.println("El numero 1 es MENOR que el 2");

        } else {// 100 == 200
            // Si no es uno o otra entonces solo queda que sean Iguales
            System.out.println("El numero 1 es IGUAL que el 2");
        }
    }

    private static void condicionalConVariasComprobaciones() {
        String nombre = "JORGE";
        String mascota = "THAI";

        // nombre es Jorge o nombre es Claudio ??
        if(nombre == "JORGE" || nombre == "CLAUDIO"){

        }

        // nombre es Jorge y mascota es Thai ??
        if(nombre == "JORGE" && mascota == "THAI"){

        }

        // nombre es Claudio y mascota NO es Thai ??
        if(nombre == "CLAUDIO" && mascota != "THAI"){

        }
    }

    private static void bucles(){
        System.out.println("** BUCLES **");

        bucleSimple();
        buclesMientras_while();
    }

    private static void bucleSimple() {
        // IMPORTANTE!!! en este caso empieza en 0 y por ultimo 4
        // Creamos un bucle que imprime 5 veces por donde va
        for (int i = 0; i < 5; i++) {
            System.out.println("Este for va por la iteracion: " + i);
        }
    }

    private static void buclesMientras_while() {
        Scanner scanner = new Scanner(System.in);
        int valorIntroducido = 0;

        // Mientras no se introduzca un numero del 1 al 7 seguimos preguntando por un numero
        while(valorIntroducido < 1 || valorIntroducido > 7){
            System.out.println("Dame un numero del 1 al 7:");
            try {
                valorIntroducido = scanner.nextInt();
            } catch (Exception e){
                System.out.println("El valor tiene que ser entre 1 y 7.");
                // Volvemos a poner valor 0 para que inicie de nuevo el bucle
                valorIntroducido = 0;
            }
        }
    }

    private static void listas(){
        System.out.println("** LISTAS / ARRAYS **");

        crearLista();
        anyadirElementoYRecorrerLista();
        eliminarDeLaLista();
    }

    private static void crearLista() {
        // Creamos una lista sin especificar el tipo
        ArrayList lista = new ArrayList();

        // Creamos una lista de String
        ArrayList<String> listaDeTexto = new ArrayList();

        // Creamos una lista de Numeros
        ArrayList<Integer> listaDeNumeros = new ArrayList();
    }

    private static void anyadirElementoYRecorrerLista() {
        // Creamos una lista de String
        ArrayList<String> listaDeTexto = new ArrayList();

        // Añadimos 2 textos a la lista
        listaDeTexto.add("texto1");
        listaDeTexto.add("texto2");

        // Mostramos solamente el 1º elemento de la lista con el .get(0) *El numero es la posicion dentro de la lista*
        System.out.println("Primer elemento de la lista: " + listaDeTexto.get(0));

        // Recorremos la lista entera y la mostramos con un For
        for (String texto : listaDeTexto){
            System.out.println(texto);
        }
    }

    private static void eliminarDeLaLista() {
        // Creamos una lista de Numeros
        ArrayList<Integer> listaDeNumeros = new ArrayList();
        Integer numeroQueVamosAEliminar = 777;

        // Añadimos 2 numeros a la lista
        listaDeNumeros.add(100);
        listaDeNumeros.add(200);
        listaDeNumeros.add(numeroQueVamosAEliminar);

        // Recorremos la lista y la mostramos con un For
        for (Integer numeroLista : listaDeNumeros){
            System.out.println(numeroLista);
        }

        /*IMPORTANTE!!! EN LAS LISTAS PODEMOS ELIMINAR POR POSICION O POR OBJETO SI LO TENEMOS*/

        // Eliminamos el primer elemento (100) pasandole la posicion del elemento *la posicion siempre empieza en 0*
        listaDeNumeros.remove(0);

        // Eliminamos el elemento que queremos
        listaDeNumeros.remove(numeroQueVamosAEliminar);
    }

    private static void objetos(){
        System.out.println("** OBJETOS Y CLASES **");

        crearObjeto();
        obtenerDatosDelObjeto();
        modificarDatosDelObjeto();
        crearListaDeObjetosEliminarYMostrarlos();
    }

    private static void crearObjeto() {
        // Lo primero es el Tipo (empieza por Mayusculas) y luego el nombre de la Variable
        Trabajador trabajador = new Trabajador();

        // Crear un Objeto (Persona) usando su Constructor
        Persona persona1 = new Persona("Jorge", "APELLIDO", 30);
    }

    private static void obtenerDatosDelObjeto() {
        // Creamos Objeto Persona
        Persona persona1 = new Persona("Jorge", "APELLIDO", 30);

        // Obtener y guardar el nombre de la Persona y la mostramos
        String nombrePersona = persona1.getNombre();
        System.out.println("Tu nombre es: " + nombrePersona);

        // Mostrar directamente su edad
        System.out.println("Tu edad es: " + persona1.getEdad());
    }

    private static void modificarDatosDelObjeto() {
        // Creamos Objeto Persona
        Persona persona1 = new Persona("Jorge", "APELLIDO", 30);

        // Mostramos los actuales campos que seran luego modificados
        System.out.println("El Antiguo nombre: " + persona1.getNombre() + " antigua edad: " + persona1.getEdad());

        // Modificamos el valor nombre , Jorge -> Claudio
        persona1.setNombre("Claudio");

        // Modificamos el valor edad , 30 -> 18
        persona1.setEdad(18);

        // Mostramos los nuevos campos
        System.out.println("El Nuevo nombre: " + persona1.getNombre() + " nueva edad: " + persona1.getEdad());

    }

    private static void crearListaDeObjetosEliminarYMostrarlos() {
        // Creamos 3 objetos de tipo Persona
        Persona persona1 = new Persona("Jorge", "APELLIDO", 30);
        Persona persona2 = new Persona("Claudio", "APELLIDO", 18);
        Persona persona3 = new Persona("Thai", "APELLIDO", 2);

        // Creamos la lista de Personas vacia , dentro de <> ponemos el tipo de la lista
        ArrayList<Persona> listaPersonas = new ArrayList();

        // Añadimos las 3 personas a la lista
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        // Recorremos la lista con un For y mostramos el nombre de cada uno
        for(Persona personaMostrada : listaPersonas){
            System.out.println("Mostramos el nombre de cada persona: " + personaMostrada.getNombre());
        }

        /* IMPORTANTE!!! En las listas se puede eliminar por posicion o por elemento si lo tenemos */

        // Eliminamos la persona en la posicion 0 de la lista
        listaPersonas.remove(0);

        // Eliminamos la persona3 de la lista
        listaPersonas.remove(persona3);

        // Recorremos de nuevo la lista para comprobar que ya no esta la persona3 THAI
        for (Persona personaOtraVez : listaPersonas){
            System.out.println("De nuevo mostramos los nombres: " + personaOtraVez.getNombre());
        }
    }

    private static void metodos() {
        System.out.println("** METODOS **");

        String texto = "ABCD";
        int numero = 8;
        int numeroDevueltoPorElMetodo;

        // Metodo que le pasamos una variable de tipo String
        crearMetodoPasandoleUnTexto(texto);

        // Metodo que le pasamos una variable de tipo Int y devuelve un numero tipo Int
        numeroDevueltoPorElMetodo = crearMetodoPasandoleUnNumeroYDevolviendolo(numero);
        System.out.println("Al metodo le pasamos el numero: " + numero);
        System.out.println("El metodo a devuelto el numero: " + numeroDevueltoPorElMetodo);
    }

    /* metodo void porque NO DEVUELVE nada , dentro de los parentesis los parametros (TIPO_VARIABLE nombreVariable)*/
    private static void crearMetodoPasandoleUnTexto(String texto) {
        System.out.println("Voy a mostrar el texto que me han pasado al metodo: " + texto);
    }

    /* metodo int porque SI DEVUELVE un numero */
    private static int crearMetodoPasandoleUnNumeroYDevolviendolo(int numero) {
        System.out.println("Voy a mostrar el numero que me han pasado al metodo: " + numero);

        // DEVOLVER EL NUMERO
        return numero;
    }

    private static void pedirDatos() {
        System.out.println("** PEDIR DATOS **");

        // Creamos el Scanner
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad = 0;

        // Pedimos su nombre y lo guardamos en una variable tipo String
        System.out.println("Dime tu nombre");
        nombre = scanner.nextLine();

        /* PARA LIMPIAR EL BUFFER*/
        scanner.nextLine();

        /* ACUERDATE que si pedimos un numero y inserta una letra lanzara una Exception y se tiene que controlar con (Try/Catch) */
        System.out.println("Dime tu edad");
        //edad = scanner.nextInt();
        try {
            edad = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Has intruducido un valor NO Numerico");
        }

        // Mostramos
        System.out.println("Hola " + nombre + " , tu edad es: " + edad);
    }
}