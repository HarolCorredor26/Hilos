import java.util.Scanner;
public class Hilo1 implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Primero Introduzca su nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola " + nombre + "!");
        }
 }