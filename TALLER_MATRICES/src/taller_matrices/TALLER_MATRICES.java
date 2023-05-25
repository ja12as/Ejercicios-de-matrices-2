
package taller_matrices;


  import java.util.Scanner;

public class TALLER_MATRICES {
    int totalPreguntas;
    char[][] respuestasEstudiante;
    char[][] respuestasCorrectas;

    TALLER_MATRICES(int totalPreguntas) {
        this.totalPreguntas = totalPreguntas;
        respuestasEstudiante = new char[totalPreguntas][1];
        respuestasCorrectas = new char[totalPreguntas][1];
    }

    void ingresarRespuestaEstudiante(int pregunta, char respuesta) {
        respuestasEstudiante[pregunta - 1][0] = respuesta;
    }

    void ingresarRespuestaCorrecta(int pregunta, char respuesta) {
        respuestasCorrectas[pregunta - 1][0] = respuesta;
    }

    int calcularNota() {
        int nota = 0;
        for (int i = 0; i < totalPreguntas; i++) {
            if (respuestasEstudiante[i][0] == respuestasCorrectas[i][0]) {
                nota++;
            }
        }
        return nota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de preguntas del examen: ");
        int totalPreguntas = scanner.nextInt();
        scanner.nextLine();

        TALLER_MATRICES calificador = new TALLER_MATRICES(totalPreguntas);

        for (int i = 0; i < totalPreguntas; i++) {
            System.out.print("Ingrese la respuesta del estudiante para la pregunta " + (i + 1) + ": ");
            char respuestaEstudiante = scanner.nextLine().charAt(0);
            calificador.ingresarRespuestaEstudiante(i + 1, respuestaEstudiante);
        }

        for (int i = 0; i < totalPreguntas; i++) {
            System.out.print("Ingrese la respuesta correcta para la pregunta " + (i + 1) + ": ");
            char respuestaCorrecta = scanner.nextLine().charAt(0);
            calificador.ingresarRespuestaCorrecta(i + 1, respuestaCorrecta);
        }

        int nota = calificador.calcularNota();
        System.out.println("La nota obtenida por el estudiante es: " + nota);
    }
}
