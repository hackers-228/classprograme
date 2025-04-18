package test;
import java.util.Scanner;

public class Sumarr1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = inp.nextInt();  
        int arr[] = new int[n];
        int sum = 0;  
         for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of an array: " +(i+1)+":" );
            arr[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];  
        }
        System.out.println("Sum of array elements: " + sum);
    }
}


