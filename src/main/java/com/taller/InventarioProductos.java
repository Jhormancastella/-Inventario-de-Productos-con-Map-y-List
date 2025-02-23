package com.taller;

import java.util.*;

public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> inventario = new HashMap<>();

        // Pedir al usuario la cantidad de categorías
        int cantidadCategorias = obtenerEnteroValido(scanner, "¿Cuántas categorías desea registrar? ");
        scanner.nextLine(); // Limpiar el buffer después de nextInt()

        // Solicitar nombres de categorías y productos
        for (int i = 0; i < cantidadCategorias; i++) {
            System.out.print("Ingrese el nombre de la categoría #" + (i + 1) + ": ");
            String categoria = scanner.nextLine();
            List<String> productos = new ArrayList<>();
            int cantidadProductos = obtenerEnteroValido(scanner, "¿Cuántos productos desea agregar a la categoría '" + categoria + "'? ");
            scanner.nextLine(); // Limpiar el buffer

            for (int j = 0; j < cantidadProductos; j++) {
                System.out.print("Ingrese el producto #" + (j + 1) + ": ");
                String producto = scanner.nextLine();
                productos.add(producto);
            }

            // Almacenar en el mapa
            inventario.put(categoria, productos);
        }

        // Menú de opciones
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Mostrar productos de una categoría");
            System.out.println("2. Agregar un producto a una categoría existente");
            System.out.println("3. Mostrar inventario completo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = obtenerEnteroValido(scanner, "Seleccione una opción: ");
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Mostrar productos de una categoría
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String categoriaBusqueda = scanner.nextLine();
                    mostrarProductosDeCategoria(inventario, categoriaBusqueda);
                    break;
                case 2:
                    // Agregar un producto a una categoría existente
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String categoriaAgregar = scanner.nextLine();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nuevoProducto = scanner.nextLine();
                    agregarProductoACategoria(inventario, categoriaAgregar, nuevoProducto);
                    break;
                case 3:
                    // Mostrar inventario completo
                    mostrarInventarioCompleto(inventario);
                    break;
                case 4:
                    // Salir del programa
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    public static void mostrarProductosDeCategoria(Map<String, List<String>> inventario, String categoria) {
        if (inventario.containsKey(categoria)) {
            System.out.println("Productos en la categoría '" + categoria + "':");
            List<String> productos = inventario.get(categoria);
            for (String producto : productos) {
                System.out.println("- " + producto);
            }
        } else {
            System.out.println("La categoría '" + categoria + "' no existe en el inventario.");
        }
    }

    public static void agregarProductoACategoria(Map<String, List<String>> inventario, String categoria, String producto) {
        if (inventario.containsKey(categoria)) {
            inventario.get(categoria).add(producto);
            System.out.println("✅ Producto '" + producto + "' agregado a la categoría '" + categoria + "'.");
        } else {
            System.out.println("La categoría '" + categoria + "' no existe en el inventario.");
        }
    }

    public static void mostrarInventarioCompleto(Map<String, List<String>> inventario) {
        System.out.println("\nInventario completo:");
        for (Map.Entry<String, List<String>> entry : inventario.entrySet()) {
            System.out.println("Categoría: " + entry.getKey());
            System.out.println("Productos:");
            for (String producto : entry.getValue()) {
                System.out.println("- " + producto);
            }
            // Separador entre categorías
            System.out.println();
        }
    }

    
    //  Solicita al usuario un número entero y lo devuelve.

    public static int obtenerEnteroValido(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
            }
        }
    }
}