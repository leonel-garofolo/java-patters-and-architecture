package lg.grasp.patters.impuestos;

import lg.grasp.patters.LineaDeImpuestos;
import lg.grasp.patters.Venta;

import java.util.List;

public class AdaptadorImpuestosPro implements ICalculadorDeImpuestos{

    /* Patron Polimorfismo:
     *  Implementacion del polimorfismo 2
     */
    @Override
    public List<LineaDeImpuestos> getImpuestos(Venta venta) {
        return null;
    }
}
