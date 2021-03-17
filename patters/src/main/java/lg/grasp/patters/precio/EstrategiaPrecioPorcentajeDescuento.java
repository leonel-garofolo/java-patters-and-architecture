package lg.grasp.patters.precio;

import lg.grasp.patters.Venta;

public class EstrategiaPrecioPorcentajeDescuento implements IEstrategiaFijarPrecio{

    private float porcentaje;

    @Override
    public Double getTotal(Venta venta) {
        return venta.getTotalSinDescuento() * porcentaje;
    }
}
