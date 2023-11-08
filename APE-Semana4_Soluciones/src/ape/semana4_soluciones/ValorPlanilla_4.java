/*
 Algoritmo-4
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de
teléfono de una casa. Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package ape.semana4_soluciones;

import java.util.Scanner;

public class ValorPlanilla_4 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double costoPlantilla;
        double minutos;
        double rta;
        System.out.println("Ingrese el costo de la plantilla de luz");
        costoPlantilla = dato.nextDouble();
        System.out.println("Ingrese los minutos utilizados");
        minutos = dato.nextDouble();
        rta = costoPlantilla * minutos;
        System.out.println("El costo a pagar es:" + rta);
    }

}
