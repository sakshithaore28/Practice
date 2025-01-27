package PracticeQue;

import java.util.*;
class Employee{
    private int id;
    private String name;
    private String address;

   
    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}
class EmployeeService {

     Map<Integer, Employee> employeeDatabase = new HashMap<>();

    public EmployeeService() {
        employeeDatabase.put(101, new Employee(101, "John", "hyd"));
        employeeDatabase.put(102, new Employee(102, "bob", "Mumbai"));
        employeeDatabase.put(103, new Employee(103, "Alice", "pune"));
    }

    public Employee findEmployee(int employeeId) throws InvalidEmployeeIdException {
        if (!employeeDatabase.containsKey(employeeId)) {
            throw new InvalidEmployeeIdException("Given Employee ID is not found or mismatched.");
        }
        return employeeDatabase.get(employeeId);
    }
}

public class Task6{
	public static void main(String[]arg) {
	EmployeeService employeeService = new EmployeeService();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Employee ID to enter the organization:");
    int employeeId = scanner.nextInt();

    try {
        Employee employee = employeeService.findEmployee(employeeId);
        System.out.println("Welcome " + employee.getName() + "!");
        System.out.println("Employee Address: " + employee.getAddress());
    } catch (InvalidEmployeeIdException e) {
        System.out.println(e.getMessage());
    } finally {
        scanner.close();
    }
}
}


