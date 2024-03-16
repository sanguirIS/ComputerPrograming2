public class RunEmployee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee name
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        // Get employee type (Full-time or Part-time)
        char employeeType;
        do {
            System.out.print("Enter employee type (F - Full-time, P - Part-time): ");
            employeeType = scanner.next().charAt(0);
            employeeType = Character.toUpperCase(employeeType); // Convert input to uppercase
        } while (employeeType != 'F' && employeeType != 'P');

        // Process employee data based on type
        if (employeeType == 'F') {
            // Full-time employee
            double monthlySalary;
            System.out.print("Enter monthly salary: ");
            monthlySalary = scanner.nextDouble();

            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, monthlySalary);
            System.out.println("Employee Name: " + fullTimeEmployee.getName());
            System.out.println("Monthly Salary: $" + String.format("%.2f", fullTimeEmployee.getMonthlySalary()));
        } else {
            // Part-time employee
            double hourlyRate;
            int hoursWorked;
            System.out.print("Enter hourly rate: ");
            hourlyRate = scanner.nextDouble();
            System.out.print("Enter hours worked this month: ");
            hoursWorked = scanner.nextInt();

            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name, hourlyRate, hoursWorked);
            System.out.println("Employee Name: " + partTimeEmployee.getName());
            System.out.println("Total Wage Earned: $" + String.format("%.2f", partTimeEmployee.getWage()));
        }
    }
}

class Employee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super.setName(name);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;

    public PartTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super.setName(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        setWage(ratePerHour, hoursWorked); // Calculate and set wage upon object creation
    }

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return ratePerHour * hoursWorked;
    }
}