package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MainAlg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Utilizo Scanner para permitir insertar valores por teclado
        int[] numbers= new int[4]; //Arreglo de 4 enteros
        boolean isPosible =false;
        for (int i =0;i<=3;i++){
            System.out.println("Ingrese el numero de la posicion: "+i);
            numbers[i]=sc.nextInt();
        }
        System.out.println("Ha ingresado el siguiente arreglo: "+ Arrays.toString(numbers));
        System.out.println("Ingrese el numero posible a formar");
        int numberSearch = sc.nextInt();

        for (int i=0;i<=3;i++){
            for (int j = 0; j <= 3; j++) {
                if (numbers[i] + numbers[j] == numberSearch && j != i) {
                    isPosible = true;
                }
            }
        }
        System.out.println(isPosible);
    }
}
