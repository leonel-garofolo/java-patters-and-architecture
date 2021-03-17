package lg.grasp.patters;

public class LineaDeVenta {

    private int articuloId;
    private Long cantidad;
    private Double price;

    public int getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal(){
        return price * cantidad;
    }
}
