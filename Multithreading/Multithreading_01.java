package Multithreading;
//here the two threads are running simultaneously
public class Multithreading_01 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Good");
            i++;
        }
    }

    public static void main(String[] args) {
        Multithreading_01 thread = new Multithreading_01();
        thread.start();

        int i = 1;

        while (true) {
            System.out.println(i + " Morning");
            i++;
        }
    }
}
