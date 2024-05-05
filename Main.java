import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tomasz", 4500, 1, "21-01-2023", "Sprzątaczka");
        Worker worker2 = new Worker("Krzysztof", 5000, 2, "23-03-2023", "Ochroniarz");
        Worker worker3 = new Worker("Miłosz", 3500, 3, "15-04-2023", "Recepcjonista");
        Worker worker4 = new Worker("Eugeniusz", 6900, 4, "19-05-2023", "Lakiernik");
        Manager manager = new Manager("Antoni", 7100, 5, "25-03-2022", "Manager");

        Employee[] employees = {worker1, worker2, worker3, worker4, manager}; 

        
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        
        System.out.println("Test id " + worker2.getName() + " z innymi pracownikami:");
        for (Employee employee : employees) {
            boolean isEqual = worker2.equals(employee);
            System.out.println(worker2.getName() + " rowna sie " + employee.getName() + ": " + isEqual);
        }
    }
}
