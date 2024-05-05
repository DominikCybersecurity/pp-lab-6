import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Dorian", 2500, 1);
        Worker worker2 = new Worker("Robert", 3400, 2);
        Worker worker3 = new Worker("Artur", 2100, 3);
        Worker worker4 = new Worker("Tomasz", 3200, 4);
        Manager manager = new Manager("Bonifacy", 3000, 5);

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work(); 
            System.out.println("- " + employee.getName() +
                " (ID: " + employee.getId() + 
                ", Stanowisko: " + employee.getPosition() + 
                ", Data zatrudnienia: " + employee.getHireDate() + 
                ", Wyplata: " + employee.getSalary() + ").");
        }
    }
}
