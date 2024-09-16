package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAlg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            List<Integer> array = new ArrayList<Integer>();
            boolean findSum = false;
            System.out.println("Ingrese la longitud del arreglo");
            Long arrayLenght = sc.nextLong();
            for (int i =0;i<=arrayLenght-1;i++){
                System.out.println("Ingrese el numero de la posicion: "+i);
                Integer userInput = sc.nextInt();
                array.add(userInput);
            }
            System.out.println("Ha ingresado el siguiente arreglo: "+array);
            System.out.println("Ingrese el numero posible a formar");
            Integer numberSearch = sc.nextInt();
            for (int i=0;i<=array.size()-1;i++){
                for (int j = 0; j <= array.size()-1; j++) {
                    if(array.get(i)+array.get(j)==numberSearch && j!=i){
                        findSum= true;break;
                    }
                }
            }
            System.out.println("Es posible formar el numero "+numberSearch+" : "+findSum);
            System.out.println("¿Desea Salir? S/N");
            String exitText = sc.next();
            if(exitText.toUpperCase().equals("S")){
                exit=true;
            }

        }while (!exit);

    }
}