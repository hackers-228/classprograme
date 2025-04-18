package test;

public class Number {
    int a; 

    public Number(int num) {
        this.a = num;
    }

    public void displayInformation() {
        if (a % 2 == 0) {
            System.out.println(a + " is an even number.");
        } else {
            System.out.println(a + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        
        Number num1 = new Number(15); 
        Number num2 = new Number(16); 

        
        num1.displayInformation(); 
        num2.displayInformation(); 
    }
}



