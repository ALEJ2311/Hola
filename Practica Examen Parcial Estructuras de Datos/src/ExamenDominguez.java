
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExamenDominguez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] preguntas = {
            "Nombre del Centro de Salud:",
            "Provincia:",
            "Ciudad:",
            "Número de camillas en buen estado:",
            "Número de camillas en mal estado:"
        };

        try {
            System.out.print("Ingrese el número de centros a registrar: ");
            int numeroCentros = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Crear archivo y escribir datos
            FileWriter fileWriter = new FileWriter("centros.txt");
            BufferedWriter escritor = new BufferedWriter(fileWriter);

            for (int i = 0; i < numeroCentros; i++) {
                System.out.println("\nCentro #" + (i + 1));
                for (String pregunta : preguntas) {
                    System.out.println(pregunta);
                    String respuesta = scanner.nextLine();
                    escritor.write(pregunta);
                    escritor.newLine();
                    escritor.write(respuesta);
                    escritor.newLine();
                }
            }
            escritor.close();

            // Leer y mostrar el archivo
            System.out.println("\n--- Contenido del archivo ---");
            FileReader fileReader = new FileReader("centros.txt");
            BufferedReader lector = new BufferedReader(fileReader);
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        } catch (IOException e) {
            System.out.println("Error al manejar el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
