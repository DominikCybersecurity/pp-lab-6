import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Dorian", 2500, 1);
        Worker worker2 = new Worker("Robert", 3400, 2);
        Worker worker3 = new Worker("Artur", 2100, 3);
        Worker worker4 = new Worker("Tomasz", 3200, 4);
        Manager manager = new Manager("Bonifacy", 3000, 5);

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
