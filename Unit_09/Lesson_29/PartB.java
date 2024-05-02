/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

public class PartB {
    public static void main(String[] args) {
        Employee employee = new Employee("Caleb", 50000.0);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Annual Salary: $" + employee.getSalary());
        System.out.println("Employee Annual Income: $" + employee.getAnnualIncome());

        System.out.println("");

        Manager manager = new Manager("Fernando", 50000.0, 10000.0);
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Annual Salary: $" + manager.getSalary());
        System.out.println("Manager Annual Bonus: $" + manager.getBonus());
        System.out.println("Manager Annual Income: $" + manager.getAnnualIncome());
    }
}
