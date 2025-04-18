package test;

import java.util.Scanner;


abstract class Calculator {
 abstract int add(int x, int y);
 abstract int sub(int x, int y);
 abstract int multi(int x, int y);
 abstract int div(int x, int y);
}


class Calc extends Calculator {
 public int add(int x, int y) {
	    int sum=x+y;
        return sum;
 }

 public int sub(int x, int y) {
	    int sub=x-y;
        return sub;
 }

 public int multi(int x, int y) {
        int multi=x*y;
	    return multi;
 }

 public int div(int x, int y) {
        int div=x/y;
        return div;
 }
}


public class Main {
 public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

     System.out.print("Enter value of x: ");
     int x = s.nextInt();
     System.out.print("Enter value of y: ");
     int y = s.nextInt();

     Calc c = new Calc();

     System.out.println(" Addition: " + c.add(x, y));
     System.out.println(" Subtraction: " + c.sub(x, y));
     System.out.println(" Multiplication: " + c.multi(x, y));
     System.out.println(" Division: " + c.div(x, y));

     s.close();  
 }
}
