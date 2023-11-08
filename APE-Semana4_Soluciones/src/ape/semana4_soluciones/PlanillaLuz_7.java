/*
 Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz.
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%
 */
package ape.semana4_soluciones;

import java.util.Scanner;

public class PlanillaLuz_7 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double costokWh;
        double kWhConsumidos;
        int edad;
        double rta;
        System.out.println("Ingrese el costo del kilovatio/hora");
        costokWh = dato.nextDouble();
        System.out.println("Consumo en el mes");
        kWhConsumidos = dato.nextDouble();
        System.out.println("Ingrese su edad");
        edad = dato.nextInt();
        if (edad >= 65) {
            rta = costokWh * kWhConsumidos;
            double descuento = rta * 0.1;
            rta = rta - descuento;
            System.out.println("El valor a cancelar es de: " + rta);
        } else {
            rta = costokWh * kWhConsumidos;
            System.out.println("El valor a cancelar es de: " + rta);
        }
    }
}
