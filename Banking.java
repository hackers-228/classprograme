package test;
import java.util.Scanner;

public  class Banking {
	String Accountholder;
	String Accountnum;
	double Balance;
	
	Banking(String accHolder,String accNum,double bal){
		Accountholder=accHolder;
		Accountnum=accNum;
		Balance=bal;
		
	}
	     
	public void deposit(double amount) {
		if (amount>0) {
			Balance+=amount;
			System.out.println("deposit:"+ amount);
		}
		else {
			System.out.println("Invalid ammount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0&& amount<=Balance) {
			Balance-=amount;
		    System.out.println("withdraw amount:"+amount);
	    }
		else {
			System.out.println("insufficient amount");
		
		}
	}
	public void display() {
		System.out.println("accountnumber: "+Accountnum+"|Accountholder:"+Accountholder+"|Balance:"+Balance);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String accNum=sc.nextLine();
		String accHolder=sc.nextLine();
		double Balance=sc.nextDouble();
		Banking acc2=new Banking(accNum,accHolder,Balance);
		acc2.display();
		acc2.deposit(500);
		acc2.withdraw(200);
		acc2.display();
		
	}

}
