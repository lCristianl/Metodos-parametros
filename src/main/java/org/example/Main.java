package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main{
    //METODOS CON MULTIPLES PARAMETROS

    public static void calculate(int a, int b){
        int sum = a + b;
        int product = a * b;
        System.out.println("La suma es: " + sum);
        System.out.println("El producto es: " + product);

    }

    //METODO RECURSIVO PARA CALCULAR EL FACTORIAL DE UN NUMERO

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    //GENERACION DE NUMEROS ALEATORIOS

    public static int generateRandomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min ) + 1) + min;
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = generateRandomNumber(1, 100);
        System.out.println("Adivina el numero entre 1 y 100");
        int guess = scanner.nextInt();
        if (guess == randomNumber) {
            System.out.println("Has acertado!");
        } else {
            System.out.println("Incorrecto! El numero era: " + randomNumber);
        }

    }

    public static void main (String[] args){
        //USO DE METODOS CON MULTIPLES PARAMETROS
        calculate(3, 7);
        //USO DE METODO RECURSIVO
        int num = 5;
        System.out.println("El factorial de " + num + " es:" + factorial(num));

        //JUEGO DE PROBABILIDAD
        playGame();

    }

}
