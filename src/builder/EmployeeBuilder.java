package builder;

class Employee {

    private String name;
    private String department;
    private int salary;

    // a private constructor with builder class as argument
    private Employee(Builder builder) {
        this.name = builder.name;
        this.department = builder.department;
        this.salary = builder.salary;
    }

    // only getters, no setters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class Builder {
        // same fields as the original class
        private String name;
        private String department;
        private int salary;

        // fields setter that will return the Builder class itself for chaining
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

public class EmployeeBuilder {
    public static void main(String[] args) {
        Employee emp = new Employee.Builder()
                .setName("John")
                .setDepartment("IT")
                .setSalary(10000)
                .build();

        System.out.println(emp);

    }
}
