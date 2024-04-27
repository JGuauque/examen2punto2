class DispositivosElectronicosTienda extends TiendaBase {
    public DispositivosElectronicosTienda(String nombreTienda, double descuento) {
        super(nombreTienda, "Dispositivos Electronicos", descuento);
    }

    @Override
    public void imprimirDetallesTiendas() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}