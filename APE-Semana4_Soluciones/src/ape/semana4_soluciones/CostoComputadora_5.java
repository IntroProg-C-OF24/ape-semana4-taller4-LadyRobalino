/*
Algoritmo-5
Generar un algoritmo que permita calcular y mostrar el costos de una computadora de escritorio.
La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 */
package ape.semana4_soluciones;

import java.util.Scanner;

public class CostoComputadora_5 {

    public static void main(String[] args) {
        double costoCPU, costoTeclado, costoPantalla, costoRaton, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el costo del CPU ");
        costoCPU = teclado.nextDouble();
        System.out.println("Ingrese el costo del Teclado ");
        costoTeclado = teclado.nextDouble();
        System.out.println("Ingrese el costo de la Pantalla ");
        costoPantalla = teclado.nextDouble();
        System.out.println("Ingrese el costo del Raton ");
        costoRaton = teclado.nextDouble();
        costoTotal = (costoCPU + costoTeclado + costoPantalla + costoRaton);
        System.out.println("Ingrese el costo total de la computadora de escritorio " + costoTotal);
    }
}
