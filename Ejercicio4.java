package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.println("Verifica si tu número es par o impar. \nIngresa tu número:");
        valor = teclado.nextInt();
        if (valor % 2 == 0){
            System.out.println("Tu número es par.");
        } else{
            System.out.println("Tu número es impar.");
        }
    }
}
