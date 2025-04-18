package test;

public class Dividebyzero {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			int result=x/y;
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("cannot divide by zero");
		}

	}

}
