/*
Algoritmo-6
Generar un solución que permita calcular y mostrar el pago mensual de un préstamo
de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ape.semana4_soluciones;
import java.util.Scanner;
public class PagoMensualPrestamo_6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double montoPrestamo;
        double tasaInteresesMensual;
        double totalMeses;
        System.out.println("Ingrese el monto del prestamo");
        montoPrestamo = dato.nextDouble();
        System.out.println("Ingrese la tasa de intereses mensual");
        tasaInteresesMensual = dato.nextDouble();
        System.out.println("Ingrese el plazo en meses");
        totalMeses = dato.nextDouble();
        double potencia = (Math.pow(1 + tasaInteresesMensual, totalMeses));
        double rta = (montoPrestamo*(tasaInteresesMensual*potencia))/(potencia - 1);
        System.out.println("La tasa a pagar va a ser: " + rta);
    }    
}
