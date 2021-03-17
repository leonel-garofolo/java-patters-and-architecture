package lg.grasp.expert;

import java.util.Date;
import java.util.List;

public class Venta {

    private Date fecha;
    private List<LineaDeVenta> lineasDeVenta;

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

    /* Experto en informacion nos dice que debemos agregar el metodo
     * en la clase que tiene la informacion para procesarla.
     * AL tener la informacion en la misma clase realiza con Bajo acomplamiento y alta cohesion
     */
    public double getTotal(){
        double total = 0;
        for(LineaDeVenta lineaDeVenta: lineasDeVenta)
            total = total + lineaDeVenta.getSubtotal();

        return total;
    }
}
