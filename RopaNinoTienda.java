class RopaNinoTienda extends TiendaBase {
    public RopaNinoTienda(String nombreTienda, double descuento) {
        super(nombreTienda, "ropa de niño", descuento);
    }

    @Override
    public void imprimirDetallesTiendas() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}