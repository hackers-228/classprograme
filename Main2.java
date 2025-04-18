package test;
 


interface Flyable {
 void fly();
}


class Sparrow implements Flyable {

 public void fly() {
     System.out.println("The sparrow is flying!");
 }
}


class Airplane implements Flyable {

 public void fly() {
     System.out.println("The airplane is soaring through the sky!");
 }
}


public class Main2 {
 public static void main(String[] args) {
     Flyable bird = new Sparrow();
     Flyable plane = new Airplane();

     bird.fly();
     plane.fly();
 }
}
