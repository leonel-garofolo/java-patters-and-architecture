package lg.grasp.patters;

/* Patron Controlador: este patron indica que el Controlador responsable
 * de administrar la entrada al sistema es el Registro, en el caso del
 * ejemplo de finalizacion de la transaccion a travez del pago del mismo.
 * Esta clase va a contener todos los eventos del CdU, finalizarVenta(),
 * introducirArticulo(),
 */
public class Registro {
    private Venta venta;

    public Registro(Venta venta){
        this.venta =venta;
    }

    /* Patron Bajo Acoplamiento: la clase registro solo depende de la clase
     *   Venta para realizar el pago. En vez de que contenga Pago y Venta
     *  para realizar el pago.
     */
    public void realizarPago(){
        venta.realizarPago();
    }
}
