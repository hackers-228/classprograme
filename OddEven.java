package test;
import java.lang.*;

class Odd extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd Number: " + i);
        }
    }
}

class Even extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}

public class OddEven {  // Only this class is public
    public static void main(String[] args) {
        Even e2 = new Even();
        Odd o2 = new Odd();

        e2.start();

        try {
            e2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        o2.start();
    }
}

