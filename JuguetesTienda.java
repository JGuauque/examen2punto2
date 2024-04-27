class JuguetesTienda extends TiendaBase {
    public JuguetesTienda(String nombreTienda, double descuento) {
        super(nombreTienda, "Juguetes", descuento);
    }

    @Override
    public void imprimirDetallesTiendas() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}