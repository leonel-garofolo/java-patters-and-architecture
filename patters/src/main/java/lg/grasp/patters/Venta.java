package lg.grasp.patters;

import lg.grasp.patters.precio.FactoriaEstrategiaPrecio;
import lg.grasp.patters.precio.IEstrategiaFijarPrecio;

import java.util.Date;
import java.util.List;

public class Venta {

    private boolean descuento;
    private Date fecha;
    private List<LineaDeVenta> lineasDeVenta;
    private double totalSinDescuento;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<LineaDeVenta> getLineasDeVenta() {
        return lineasDeVenta;
    }

    public void setLineasDeVenta(List<LineaDeVenta> lineasDeVenta) {
        this.lineasDeVenta = lineasDeVenta;
    }

    /* Patron Creador indica que Venta es un buen candidato
     * para crear la linea de venta.
     * Aunque por complejidad se recomienda que la creacion de clases
     * la lleve a cabo otro patron Factoria en vez de la clase que dice Creador.
     */
    public LineaDeVenta crearLineaDeVenta(long cantidad){
        LineaDeVenta lineaDeVenta = new LineaDeVenta();
        lineaDeVenta.setCantidad(cantidad);
        return lineaDeVenta;
    }

    /* Patron Experto en informacion nos dice que debemos agregar el metodo
     * en la clase que tiene la informacion para procesarla.
     * AL tener la informacion en la misma clase realiza con Bajo acomplamiento y alta cohesion
     */
    public double getTotal(){
        double total = 0;
        for(LineaDeVenta lineaDeVenta: lineasDeVenta)
            total = total + lineaDeVenta.getSubtotal();

        this.totalSinDescuento = total;
        double totalDescuento = isDescuento() ? FactoriaEstrategiaPrecio.getInstance().getEstrategiaFijarPrecioDescuento().getTotal(this):0;
        totalDescuento = totalDescuento - FactoriaEstrategiaPrecio.getInstance().getEstrategiaFijarPrecioUmbral().getTotal(this);
        return totalDescuento;
    }

    public double getTotalSinDescuento() {
        return totalSinDescuento;
    }

    public void realizarPago(){
        Pago pago = new Pago();

    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
}
