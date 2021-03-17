package lg.grasp.patters.precio;

// Creacion de Factoria con singleton para dar responsabilidad de la politica de precios.
public class FactoriaEstrategiaPrecio {
    private static FactoriaEstrategiaPrecio instance;

    public static synchronized FactoriaEstrategiaPrecio getInstance(){
        if(instance == null) {
           instance = new FactoriaEstrategiaPrecio();
        }
        return instance;
    }

    public IEstrategiaFijarPrecio getEstrategiaFijarPrecioDescuento(){
        return new EstrategiaPrecioPorcentajeDescuento();
    }

    public IEstrategiaFijarPrecio getEstrategiaFijarPrecioUmbral(){
        return new EstrategiaPrecioDescuentoUmbral();
    }
}
