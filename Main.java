import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Dorian", 2500, 1, "21-01-2023", "Ochroniarz");
        Worker worker2 = new Worker("Robert", 3400, 2, "23-03-2023", "Sprzątacz");
        Worker worker3 = new Worker("Artur", 2100, 3, "15-04-2023", "Dozorca");
        Worker worker4 = new Worker("Tomasz", 3200, 4, "19-05-2023", "Recepcjonista");
        Manager manager = new Manager("Bonifacy", 3000, 5, "25-03-2022", "Manager");

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
