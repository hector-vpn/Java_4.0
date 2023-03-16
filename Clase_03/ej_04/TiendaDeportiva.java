public class TiendaDeportiva {
    public static void main(String[] args) {
        int n = 5; // número de productos a mostrar
        Producto[] productos = new Producto[n];
        productos[0] = new Producto("Pelota de fútbol", 19.99);
        productos[1] = new Producto("Raqueta de tenis", 89.99);
        productos[2] = new Producto("Balón de baloncesto", 24.99);
        productos[3] = new Producto("Bicicleta de montaña", 499.99);
        productos[4] = new Producto("Pantalón deportivo", 39.99);

        // Mostrar los productos y sus precios
        for (int i = 0; i < n; i++) {
            System.out.println(productos[i].getNombre() + ": $" + productos[i].getPrecio());
        }
    }
}
