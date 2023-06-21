//q19
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Mary", 30));
        employees.add(new Employee("Tom", 22));
        employees.add(new Employee("Peter", 28));

        System.out.println("Employees sorted by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
