/*
 Algoritmo-9
El programa debe calcular el área del polígono. La figura se compone de un cuadrado perfecto (A),
tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado,
y un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide
lo mismo que la altura de los triángulos. Se pide que haga un programa que calcule el área total.
 */
package ape.semana4_soluciones;

import java.util.Scanner;

public class AreaPoligono_9 {

    public static void main(String[] args) {
        double alturaTriangulo, ladoCuadrado, areaTriangulo, areaRectangulo, areaCuadrado, areaTotal;
        Scanner teclado = new Scanner(System.in); //Inicializar22
        System.out.println("Ingrese el lado del cuadrado ");
        ladoCuadrado = teclado.nextDouble();
        System.out.println("Ingrese la altura del triangulo ");
        alturaTriangulo = teclado.nextDouble();
        areaCuadrado = ladoCuadrado * ladoCuadrado;
        areaTriangulo = (ladoCuadrado * alturaTriangulo) / 2;
        areaRectangulo = ladoCuadrado * alturaTriangulo;
        areaTotal = areaTriangulo * 3 + areaCuadrado + areaRectangulo;
        System.out.println("El area total del poligono es: " + areaTotal);
    }
}
