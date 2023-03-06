import java.util.Scanner;

public class Hilo3 implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tercero Introduzca su estatura en centímetros: ");
        int estatura = scanner.nextInt();

        if (estatura > 180) {
            System.out.println("El usuario es alto.");
        } else {
            System.out.println("El usuario es bajo.");
        }

        scanner.close();
        }
    }

