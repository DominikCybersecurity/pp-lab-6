import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Dorian", 2500, 1);
        Worker worker2 = new Worker("Robert", 3400, 2);
        Worker worker3 = new Worker("Artur", 2100, 3);
        Worker worker4 = new Worker("TomaszMarcel", 3200, 4);
        Manager manager = new Manager("Bonifacy", 3000, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println(worker.getName() + " zarabia " + worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getName() + " zarabia " + manager.getSalary());
        manager.work();
    }
}
