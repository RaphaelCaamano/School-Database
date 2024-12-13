public class Employee {
    private String name;
    private int birthYear;
    private String deptName;

    public Employee() {
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

    // Other methods for Employee

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return birthYear == employee.birthYear && name.equals(employee.name) && deptName.equals(employee.deptName);
    }

    @Override
    public String toString() {
        return String.format("Employee: Name: %s | Birth Year: %d | Department: %s", name, birthYear, deptName);
    }

    @Override
    public int compareTo(Person p) {
        if (p instanceof Employee) {
            Employee otherEmployee = (Employee) p;
            return Integer.compare(this.birthYear, otherEmployee.birthYear);
        }
        return -1;
    }
}
