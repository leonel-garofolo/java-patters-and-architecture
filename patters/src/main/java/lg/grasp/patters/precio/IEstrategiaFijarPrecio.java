package lg.grasp.patters.precio;

import lg.grasp.patters.Venta;

// Inteface unica del patron estrategia
public interface IEstrategiaFijarPrecio {

    Double getTotal(Venta venta);
}
