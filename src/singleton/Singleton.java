
package singleton;

/**
 * @author raguiarperez
 */
public class Singleton {

    public static void main(String[] args) {
        NewSingleton obx1 = NewSingleton.Instanciar();
        NewSingleton obx2 = NewSingleton.Instanciar();
        obx1.setNombre("carlos");
        obx1.setApellido("Gomez");
        obx1.setDni("1");
        obx1.mostrar();
        obx2.setNombre("pedro");
        obx2.setApellido("Rodriguez");
        obx2.setDni("2");
        obx1.mostrar();
        obx2.mostrar();
    }
    
}