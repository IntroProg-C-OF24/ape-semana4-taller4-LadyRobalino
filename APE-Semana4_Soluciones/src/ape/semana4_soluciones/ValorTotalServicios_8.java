/*
 Algoritmo-8
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual
de servicios digitales de una persona. Los servicios digitales son:netflix, youtube premium,
dropbox, spotify. Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape.semana4_soluciones;

import java.util.Scanner;

public class ValorTotalServicios_8 {

    public static void main(String[] args) {
        double valorNetflix, valorYoutubeP, valorDropbox, valorSpotify, valorTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de Netflix ");
        valorNetflix = teclado.nextDouble();
        System.out.println("Ingrese el valor de Youtube Premiun ");
        valorYoutubeP = teclado.nextDouble();
        System.out.println("Ingrese el valor de Dropbox ");
        valorDropbox = teclado.nextDouble();
        System.out.println("Ingrese el valor de Spotify ");
        valorSpotify = teclado.nextDouble();
        valorTotal = (valorNetflix + valorYoutubeP + valorDropbox + valorSpotify);
        System.out.println("El valor total a pagar mensualmente es: " + valorTotal);
    }
}
