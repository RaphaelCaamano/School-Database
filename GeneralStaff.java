public class Employee {
    private String name;
    private int birthYear;
    private String deptName;

    public Employee() {
        // Default constructor
    }

    public Employee(String name, int birthYear, String deptName) {
        this.name = name;
        this.birthYear = birthYear;
        this.deptName = deptName;
    }

    // Getters and setters for Employee attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    // Equals and toString methods

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return birthYear == employee.birthYear &&
                Objects.equals(name, employee.name) &&
                Objects.equals(deptName, employee.deptName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}

public class GeneralStaff extends Employee {
    private String duty;

    public GeneralStaff() {
        this.duty = "";
    }

    public GeneralStaff(String duty) {
        this.duty = duty;
    }

    public GeneralStaff(String deptName, String duty) {
        super.setDeptName(deptName);
        this.duty = duty;
    }

    public GeneralStaff(String name, int birthYear, String deptName, String duty) {
        super.setName(name);
        super.setBirthYear(birthYear);
        super.setDeptName(deptName);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        GeneralStaff generalStaff = (GeneralStaff) obj;
        return Objects.equals(duty, generalStaff.duty);
    }

    @Override
    public String toString() {
        return super.toString() + " GeneralStaff: Duty: " + duty;
    }
}

public class Main {
    public static void main(String[] args) {
        GeneralStaff staff1 = new GeneralStaff();
        GeneralStaff staff2 = new GeneralStaff("Coding");
        GeneralStaff staff3 = new GeneralStaff("IT Department", "Testing");
        GeneralStaff staff4 = new GeneralStaff("John Doe", 1990, "Finance", "Accounting");

        System.out.println(staff1);
        System.out.println(staff2);
        System.out.println(staff3);
        System.out.println(staff4);

        System.out.println(staff1.equals(staff2));
        System.out.println(staff2.equals(staff3));
        System.out.println(staff3.equals(staff4));
    }
}
