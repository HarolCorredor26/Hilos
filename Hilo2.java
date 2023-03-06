import java.util.Scanner;

public class Hilo2 implements Runnable {
    @Override
    public void run() {
         Scanner entrada = new Scanner(System.in);

        // Pedir la edad del usuario
        System.out.print("Segundo Ingrese su edad: ");
        int edad = entrada.nextInt();

        // Condicionar la edad y mostrar un mensaje correspondiente
        if (edad >= 18) {
            System.out.println(" Usted es apto para votar.");
        } else {
            System.out.println("Usted no es apto para votar.");
        }
    }
}