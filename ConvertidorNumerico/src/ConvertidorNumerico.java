/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author varga
 */

    
import java.util.Scanner;

public class ConvertidorNumerico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- CONVERTIDOR DE SISTEMAS NUMÉRICOS ---");
            System.out.println("1. Decimal a Binario");
            System.out.println("2. Decimal a Hexadecimal");
            System.out.println("3. Decimal a Octal");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Ingrese un número decimal: ");
                int numero = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado en Binario: " + Integer.toBinaryString(numero));
                        break;
                    case 2:
                        System.out.println("Resultado en Hexadecimal: " + Integer.toHexString(numero).toUpperCase());
                        break;
                    case 3:
                        System.out.println("Resultado en Octal: " + Integer.toOctalString(numero));
                        break;
                }
            } else if (opcion != 4) {
                System.out.println("Opción inválida, intenta nuevamente.");
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado.");
    }
}
