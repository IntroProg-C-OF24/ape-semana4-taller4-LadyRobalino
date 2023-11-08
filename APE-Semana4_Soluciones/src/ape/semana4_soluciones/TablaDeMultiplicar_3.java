/*
 Algoritmo-3
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de
un número ingresado por el usuario; solo en el caso que el valor del número esté entre 2 y 6.
 */
package ape.semana4_soluciones;
import java.util.Scanner;
public class TablaDeMultiplicar_3 {
    public static void main(String[] args) {
          int numUsuario;
        Scanner dato = new Scanner(System.in);
        int rta;
        System.out.println("Ingrese un numero entre 2 y 6");
        int num = dato.nextInt();
        if (num >= 2) {
            if (num <= 6) {
                System.out.println("======TABLA DE MULTIPLICAR=====");
                for (int i = 0; i <= 12; i++) {
                    rta = num * i;
                    System.out.println(num + " X " + i + " = " + rta);
                }
            } else {
                System.out.println("El numero ingresado no esta dentro de los parametros establecidos");
            }
        } else {
            System.out.println("El numero ingresado no esta dentro de los parametros establecidos");
        }
    }
}