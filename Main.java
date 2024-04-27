public class Main {
    public static void main(String[] args) {
        Tienda tienda1 = new RopaNinoTienda("Templo de la moda", 10);
        Tienda tienda2 = new DispositivosElectronicosTienda("Steren", 5);
        Tienda tienda3 = new JuguetesTienda("ToySmart", 15);

        tienda1.imprimirDetallesTiendas();
        tienda2.imprimirDetallesTiendas();
        tienda3.imprimirDetallesTiendas();
    }
}