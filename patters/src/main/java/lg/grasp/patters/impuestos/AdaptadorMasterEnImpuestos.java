package lg.grasp.patters.impuestos;

import lg.grasp.patters.LineaDeImpuestos;
import lg.grasp.patters.Venta;

import java.util.List;

/* Patron Adaptador: a travez de indireccion que adapten las interfaces.
 * Patron Indireccion: Debemos crear un objeto intermedio que separe la
 * logica de negocio con la comunicacion con sistemas externos, como por ejemplo
 * la comunicacion con la API de AFIP
 */
public class AdaptadorMasterEnImpuestos implements ICalculadorDeImpuestos{

    /* Patron Polimorfismo:
     *  Implementacion del polimorfismo 1
     */
    @Override
    public List<LineaDeImpuestos> getImpuestos(Venta venta) {
        // TODO comunicar con servicio de AFIP
        return null;
    }
}
