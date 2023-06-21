import java.util.ArrayList;
import java.util.List;

class Student {
    private int rollNo;
    private String name;
    private String city;

    public Student(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", "Mumbai"));
        students.add(new Student(2, "Jane", "Delhi"));
        students.add(new Student(3, "Bob", "Mumbai"));
        students.add(new Student(4, "Alice", "Chennai"));

        // Retrieve the information of students from Mumbai
        for (Student student : students) {
            if (student.getCity().equals("Mumbai")) {
                System.out.println("Roll No: " + student.getRollNo());
                System.out.println("Name: " + student.getName());
                System.out.println("City: " + student.getCity());
                System.out.println();
            }
        }
    }
}