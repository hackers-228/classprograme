package test;
import java.lang.*;
public class SingleClTh extends Thread {
    public void run() {
        System.out.println("This is an Example of Singletask to Multithreading");
    }

    public static void main(String[] args) {
        SingleClTh t1 = new SingleClTh();
        SingleClTh t2 = new SingleClTh();
        SingleClTh t3 = new SingleClTh();

        t1.start();
        t2.start();
        t3.start();
    }
}

