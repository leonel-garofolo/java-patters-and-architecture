package lg.grasp.patters.impuestos;

import lg.grasp.patters.LineaDeImpuestos;
import lg.grasp.patters.Venta;

import java.util.List;

/* Patron variaciones protegidas: nos indica que creemos una interface para cubrir
 * los objetos que se comunican con otros sistemas (potencialmente inestables)
 * siendose adaptables y flexibles a nuevas implementaciones o cambios.
 */
public interface ICalculadorDeImpuestos {

    /* Patron Polimorfismo:
     *  Metodo que se implementara en distintos objetos implementando
     *  el polimorfismo
     */
    List<LineaDeImpuestos> getImpuestos(Venta venta);
}
