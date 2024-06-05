import java.util.Scanner;

public class Examen{
    public static void main(String args[]) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un operador matematico[+ - * /]: ");
        String operador = scanner.nextLine();
        System.out.println("Ingrese el primer numero: ");
        Double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        Double numero2 = scanner.nextDouble();
        
        if (operador.equals("+")){ //SUMA
            double resultado = numero1 + numero2;
            System.out.println("El resultado de " + numero1 + " + " + numero2 + " es: " + resultado);
        } else if (operador.equals("-")){ //RESTA
            double resultado = numero1 - numero2;
            System.out.println("El resultado de " + numero1 + " - " + numero2 + " es: " + resultado);
        } else if (operador.equals("*")){ //MULTIPLICACION
            double resultado = numero1 * numero2;
            System.out.println("El resultado de " + numero1 + " * " + numero2 + " es: " + resultado);
        } else if (operador.equals("/")){ //DIVISION
            double resultado = numero1 / numero2;
            System.out.println("El resultado de " + numero1 + " / " + numero2 + " es: " + resultado);
        } 

        scanner.close();
    }
    
    
}