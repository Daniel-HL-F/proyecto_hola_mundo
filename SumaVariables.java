import java.util.Scanner;

public class SumaVariables {

    public static void main(String[] args) {

        // Declarar variables
        int num1;
        int num2;
        int suma;

        // Scanner para pedir datos
        Scanner entrada = new Scanner(System.in);

        // Pedir valores
        System.out.print("Ingresa el primer número: ");
        num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo número: ");
        num2 = entrada.nextInt();

        // Sumar
        suma = num1 + num2;

        // Imprimir resultado
        System.out.println("La suma es: " + suma);

    }
}
