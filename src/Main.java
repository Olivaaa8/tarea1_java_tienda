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
                    break;
                case 2:
                    // Agregar al carrito
                    break;
                case 3:
                    // Calcular total a pagar
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