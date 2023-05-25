
package taller_matrices;

import java.util.Scanner;

public class SumaBinaria {
    private int[][] tablaSuma;

    SumaBinaria() {
        tablaSuma = new int[][] {
            {0, 0, 0},
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 10}
        };
    }

    String sumarBinarios(String binario1, String binario2) {
        int maxLen = Math.max(binario1.length(), binario2.length());

        binario1 = completarCeros(binario1, maxLen);
        binario2 = completarCeros(binario2, maxLen);


        int[] numero1 = convertirAEnteros(binario1);
        int[] numero2 = convertirAEnteros(binario2);


        int[] resultado = sumaBinaria(numero1, numero2);


        String resultadoBinario = convertirABinario(resultado);

        return resultadoBinario;
    }

    String completarCeros(String binario, int longitud) {
        StringBuilder builder = new StringBuilder(binario);
        while (builder.length() < longitud) {
            builder.insert(0, '0');
        }
        return builder.toString();
    }

    int[] convertirAEnteros(String binario) {
        int[] numero = new int[binario.length()];
        for (int i = 0; i < binario.length(); i++) {
            numero[i] = binario.charAt(i) - '0';
        }
        return numero;
    }

    int[] sumaBinaria(int[] numero1, int[] numero2) {
        int[] resultado = new int[numero1.length + 1];
        int acarreo = 0;

        for (int i = numero1.length - 1; i >= 0; i--) {
            int suma = tablaSuma[numero1[i]][numero2[i]] + acarreo;
            resultado[i + 1] = suma % 2;
            acarreo = suma / 2;
        }

        resultado[0] = acarreo;
        return resultado;
    }

    String convertirABinario(int[] numero) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numero.length; i++) {
            builder.append(numero[i]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumaBinaria sumaBinaria = new SumaBinaria();

        System.out.print("Ingrese el primer número binario: ");
        String binario1 = scanner.nextLine();

        System.out.print("Ingrese el segundo número binario: ");
        String binario2 = scanner.nextLine();

        String resultado = sumaBinaria.sumarBinarios(binario1, binario2);
        System.out.println("La suma de los números binarios es: " + resultado);
    }
}
