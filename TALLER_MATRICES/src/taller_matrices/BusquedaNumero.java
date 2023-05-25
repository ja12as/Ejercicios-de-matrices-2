
package taller_matrices;
import java.util.Scanner;

public class BusquedaNumero {
    private int[] arreglo;

    BusquedaNumero(int tamaño) {
        arreglo = new int[tamaño];
    }

    void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los números enteros separados por espacios:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }
    }

    void buscarNumero(int numero) {
        System.out.println("Los índices de las posiciones donde se encuentra el número " + numero + " son:");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int tamaño = scanner.nextInt();

        BusquedaNumero busqueda = new BusquedaNumero(tamaño);
        busqueda.ingresarDatos();

        System.out.println("Ingrese el número que desea buscar:");
        int numero = scanner.nextInt();

        busqueda.buscarNumero(numero);
    }
}
