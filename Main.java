import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Robert", 5100, 1, "21-01-2023", "Kasjer");
        Worker worker2 = new Worker("Eugeniusz", 4800, 2, "23-03-2023", "Sprzątaczka");
        Worker worker3 = new Worker("Kacper", 3600, 3, "15-04-2023", "Ochroniarz");
        Worker worker4 = new Worker("Jakub", 6900, 4, "19-05-2023", "Konserwator");
        Manager manager = new Manager("Hubert", 5200, 5, "25-03-2022", "Manager");

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
