import java.util.Scanner;

public class EXAMENPRODUCTOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        System.out.println("   CAJA - TIENDA DE ABARROTES");
            System.out.println("\nProductos disponibles:");
            System.out.println("  1 = Leche     $25");
            System.out.println("  2 = Pan       $12");
            System.out.println("  3 = Huevo     $40");
            System.out.println("  4 = Refresco  $18");
            System.out.print("Ingrese el codigo del producto: ");
            int codigo = sc.nextInt();
            String nombre;
            double precio;
            switch (codigo) {
                case 1:
                    nombre = "Leche";
                    precio = 25;
                    break;
                case 2:
                    nombre = "Pan";
                    precio = 12;
                    break;
                case 3:
                    nombre = "Huevo";
                    precio = 40;
                    break;
                case 4:
                    nombre = "Refresco";
                    precio = 18;
                    break;
                default:
                    System.out.println("Codigo no valido");
                    continue; 
            }
            int cantidad = 0;
            do {
                System.out.print("Ingrese la cantidad: ");
                cantidad = sc.nextInt();
                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor a 0. Intente de nuevo.");
                }
            } while (cantidad <= 0);
            nombres[totalProductos] = nombre;
            cantidades[totalProductos] = cantidad;
            subtotales[totalProductos] = precio * cantidad;
            totalProductos++;
            System.out.println("Producto agregado: " + nombre + " x" + cantidad +
                    " = $" + (precio * cantidad));
            if (totalProductos < MAX_PRODUCTOS) {
                System.out.print("¿Agregar otro producto? (s/n): ");
                char respuesta = sc.next().toLowerCase().charAt(0);
                if (respuesta != 's') {
                    seguir = false;
                }
            } else {
                System.out.println("Carrito lleno (maximo 20 productos).");
            }
        }
        double total = 0;
        for (int i = 0; i < totalProductos; i++) {
            total += subtotales[i];
        }

        double descuento = 0;
        if (total > 200) {
            descuento = total * 0.10;
        }
        double totalPagar = total - descuento;
        System.out.println("          TICKET DE COMPRA");
        for (int i = 0; i < totalProductos; i++) {
            System.out.printf("%-10s x%-3d  $%.2f%n",
                    nombres[i], cantidades[i], subtotales[i]);
        }
        System.out.printf("Subtotal:            $%.2f%n", total);
        if (descuento > 0) {
            System.out.printf("Descuento (10%%):    -$%.2f%n", descuento);
        }
        System.out.printf("TOTAL A PAGAR:       $%.2f%n", totalPagar);
        System.out.println("     ¡Gracias por su compra!");

        sc.close();
    }
}
