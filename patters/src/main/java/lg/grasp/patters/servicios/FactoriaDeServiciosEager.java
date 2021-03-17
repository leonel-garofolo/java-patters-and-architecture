package lg.grasp.patters.servicios;

// Patron Singleton con inicializacion Eager.
public class FactoriaDeServiciosEager {
    public static FactoriaDeServiciosEager instance = new FactoriaDeServiciosEager();

    public static  FactoriaDeServiciosEager getInstance(){
        return instance;
    }
}
