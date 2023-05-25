
package taller_matrices;
import java.util.Scanner;

public class PartidarioArray {
    private int[] array;

    PartidarioArray(int[] array) {
        this.array = array;
    }

    boolean esPartidario() {
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        PartidarioArray partidarioArray = new PartidarioArray(arreglo);
        if (partidarioArray.esPartidario()) {
            System.out.println("El arreglo es partidario.");
        } else {
            System.out.println("El arreglo no es partidario.");
        }
    }
}
