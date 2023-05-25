
package taller_matrices;
import java.util.Scanner;

class Normalizacion {

    double[] numeros;
    double mayor;

    Normalizacion(double[] numeros) {
        this.numeros = numeros;
    }

    void encontrarMayor() {
        mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
    }

    void normalizar() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] / mayor;
        }
    }

    void imprimirNumeros() {
        System.out.println("Números normalizados:");
        for (double numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a normalizar: ");
        int cantidadNumeros = scanner.nextInt();

        double[] numeros = new double[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        Normalizacion normalizacion = new Normalizacion(numeros);
        normalizacion.encontrarMayor();
        normalizacion.normalizar();
        normalizacion.imprimirNumeros();

        scanner.close();
    }
}
