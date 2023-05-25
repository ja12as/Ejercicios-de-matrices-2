
package taller_matrices;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    private int[] array1;
    private int[] array2;
    private int[] mergedArray;

    MergeArrays(int size1, int size2) {
        array1 = new int[size1];
        array2 = new int[size2];
    }

    void readArrays() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos del primer arreglo ordenados ascendentemente:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo arreglo ordenados ascendentemente:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
    }

    void mergeArrays() {
        mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }
    }

    void displayMergedArray() {
        System.out.println("Lista ordenada de la mezcla de los dos arreglos:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del primer arreglo:");
        int size1 = scanner.nextInt();

        System.out.println("Ingrese el tamaño del segundo arreglo:");
        int size2 = scanner.nextInt();

        MergeArrays mergeArrays = new MergeArrays(size1, size2);
        mergeArrays.readArrays();
        mergeArrays.mergeArrays();
        mergeArrays.displayMergedArray();
    }
}
