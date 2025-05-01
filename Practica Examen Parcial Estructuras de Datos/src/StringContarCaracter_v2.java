/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class StringContarCaracter_v2 {
    public static void main(String[] args) {
        String cadena = "Universidad Tecnica";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = entrada.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            String letraPalabra = cadena.substring(i, (i + 1));
            if (letraPalabra.equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("El caracter se repite " + contador + " veces");
    }
}


