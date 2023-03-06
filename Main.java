public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Hilo1());
        Thread t2 = new Thread(new Hilo2());
        Thread t3 = new Thread(new Hilo3());
        Thread t4 = new Thread(new HiloAudio());
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}