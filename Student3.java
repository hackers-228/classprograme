package test;

public class Student3 {
    int id;
    String name;

    
    Student3(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    
    void displayinformation() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        
        Student3 s1 = new Student3(101, "Alice");
        Student3 s2 = new Student3(102, "Bob");

       
        s1.displayinformation();
        s2.displayinformation();
    }
}

