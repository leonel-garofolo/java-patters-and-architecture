package lg.grasp.patters.precio;

import lg.grasp.patters.Venta;

/* patron Estrategia: Indica que debemos crear una clase por cada politica / algoritmo
 * estrategia implementando una interface unica.
 */
public class EstrategiaPrecioDescuentoUmbral implements IEstrategiaFijarPrecio{

    private float descuento;
    private float umbral;

    @Override
    public Double getTotal(Venta venta) {
        double total  = venta.getTotalSinDescuento();
        if(total < umbral){
            return total;
        }
        return total - descuento;
    }
}
