package test;

public class Rcoem {
	String name;
	int salary;
	Rcoem(int i, String string){
		System.out.println("constructor called:");
		name="ECS";
		salary = 4000;
	}

	public static void main(String[] args) {
		Rcoem obj = new Rcoem();
		System.out.println("The name is :"+obj.name);
		System.out.println("The salary is :"+obj.salary);
		// TODO Auto-generated method stub

	}

}
