class Employee {
    protected String name;
    protected int employeeId;
    protected double baseSalary;
    protected String department;

    public Employee(String name, int employeeId, double baseSalary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.department = department;
        System.out.println("Employee " + name + " has been hired in " + department + " department");
    }

    public void displayInfo() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Department: " + department);
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void work() {
        System.out.println(name + " is working on general tasks");
    }
}


class Manager extends Employee {
    private double bonus;
    private int teamSize;

    public Manager(String name, int employeeId, double baseSalary, String department, double bonus, int teamSize) {
        super(name, employeeId, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + " has been promoted to Manager");
    }


    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public void work() {
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " employees");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize + " employees");
    }
}

// Developer.java - Child Class
class Developer extends Employee {
    private String programmingLanguage;
    private int projectsCompleted;

    public Developer(String name, int employeeId, double baseSalary, String department, String programmingLanguage, int projectsCompleted) {
        super(name, employeeId, baseSalary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer");
    }


    public double calculateSalary() {
        return baseSalary + (projectsCompleted * 1000);
    }


    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}


class Intern extends Employee {
    private String university;
    private boolean isFullTime;

    public Intern(String name, int employeeId, double baseSalary, String department, String university, boolean isFullTime) {
        super(name, employeeId, baseSalary, department);
        this.university = university;
        this.isFullTime = isFullTime;
        System.out.println("Intern " + name + " from " + university + " has started");
    }


    public double calculateSalary() {
        return baseSalary * 0.5;
    }


    public void work() {
        System.out.println(name + " is learning and assisting with tasks");
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("University: " + university);
        System.out.println("Full-time: " + isFullTime);
    }
}
