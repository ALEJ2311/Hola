/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class NumeroDeVocales {

    public static void main(String[] args) {
        String strCadena = "Universidad Tecnica";
        System.out.println("El numero de vocales es: " + vocales(strCadena));
    }

    public static int vocales(String strCadena) {
        int contador = 0;
        strCadena = strCadena.toLowerCase();
        for (int i = 0; i < strCadena.length(); i++) {
            switch (strCadena.charAt(i)) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
            }
        }
        return contador;
    }
}
