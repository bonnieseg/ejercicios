package Ejercicios;
import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor;
        System.out.println("Calcula el área de un circulo. \nIngresa el radio del círculo");
        valor = teclado.nextDouble();
        double area = valor*valor*3.1416;
        System.out.println("El área es: " + area);
    }
}