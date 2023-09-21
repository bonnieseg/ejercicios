package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anno;

        System.out.println("Verifica si tu año es bisiesto \nIngresa tu año:");
        anno = teclado.nextInt();
        if(anno % 4 == 0){
            System.out.println("Tu año es bisiesto");
        } else{
            System.out.println("Tu año no es bisiesto");
        }
    }
}
