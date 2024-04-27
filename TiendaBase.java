abstract class TiendaBase implements Tienda {
    protected String nombreTienda;
    protected String tipoDeComercio;
    protected double descuento;

    public TiendaBase(String nombreTienda, String tipoDeComercio, double descuento) {
        this.nombreTienda = nombreTienda;
        this.tipoDeComercio = tipoDeComercio;
        this.descuento = descuento;
    }
}