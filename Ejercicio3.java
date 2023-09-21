package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;

        System.out.println("Verifica su tu número es positivo, negativo o cero. \nIngresa tu número: ");
        valor = teclado.nextInt();

        if (valor > 0){
            System.out.println("Tu número es positivo.");
        } else {
            if (valor < 0){
                System.out.println("Tú numero es negativo.");
            } else{
                System.out.println("Tú numero es cero.");
            }
        }
    }
}
