import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arreglos de productos, precios, carrito
        String[] productos = {"Laptop", "Audifonos", "Iphone", "Tablet"};
        double[] precios = {1000.0, 200.0, 800.0, 300.0};
        String[] carrito = new String[productos.length];
        Scanner o = new Scanner(System.in);

        int opcion;

        // Menu de opciones
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar al carrito");
            System.out.println("3. calcular total a pagar");
            System.out.println("4. Salir");
            opcion = o.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar productos
                    System.out.println("Productos disponibles:");
                    for (int i = 0; i < productos.length; i++) {
                        System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
                    }
                    break;
                case 2:
                    // Agregar al carrito
                    System.out.println("Ingrese el numero del producto a agregar al carrito:");
                    int productoSeleccionado = o.nextInt() - 1;
                    if (productoSeleccionado >= 0 && productoSeleccionado < productos.length) {
                        carrito[productoSeleccionado] = productos[productoSeleccionado];
                        System.out.println(productos[productoSeleccionado] + " ha sido agregado al carrito.");
                    } else {
                        System.out.println("Producto no valido.");
                    }
                    break;
                case 3:
                    // Calcular total a pagar
                    double total = 0.0;
                    System.out.println("Productos en el carrito:");
                    for (int i = 0; i < carrito.length; i++) {
                        if (carrito[i] != null) {
                            System.out.println(carrito[i] + " - $" + precios[i]);
                            total += precios[i];
                            System.out.println("Total a pagar: $" + total);
                        }
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
    }
}