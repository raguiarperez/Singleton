
package singleton;

/**
 * @author rafa2
 */
public class NewSingleton {

    private String nombre, apellido, dni;

    private static final NewSingleton INSTANCIAR = new NewSingleton();


    private NewSingleton() {

    }

    public static NewSingleton Instanciar() {
        return INSTANCIAR;
    }

    public void mostrar() {
        System.out.println("nombre: " + this.nombre + " apellido: " + this.apellido + " dni: " + this.dni);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}