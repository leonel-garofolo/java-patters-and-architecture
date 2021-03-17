package lg.grasp.patters.servicios;

/* Patron Singleton: establece a la clase factoria crea un metodo global que
 * devuelva una unica instance de la clase que devuelve un unico objeto (Singleton).
 * Inicializacion perezosa (lazy)
 */
public class FactoriaDeServicios {
    public static FactoriaDeServicios instance;

    public static synchronized FactoriaDeServicios getInstance(){
        if(instance == null){
            instance = new FactoriaDeServicios();
        }
        return instance;
    }
}
