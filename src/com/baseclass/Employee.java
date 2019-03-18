package com.baseclass;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String name = getFirstName() + getLastName();
    private int salary;


    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary ;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary (){
        int annualSalary = salary * 12;
        return annualSalary;
    }
    public int raiseSalary (int percent) {
        int raiseSalary;
        raiseSalary = salary * percent/100;
        salary = salary + raiseSalary;
        return  raiseSalary;
    }

    @Override
    public String toString() {
        return "Employee[" + "id =" + id + ", name ='" + name + '\'' + ", salary =" + salary + ']';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee equal = (Employee) obj;
        return id == equal.id &&
                salary == equal.salary &&
                firstName.equals(equal.firstName) &&
                lastName.equals(equal.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + id;
        result = 37 * result + salary;
        result = 37 * result + (firstName == null ? 0 : firstName.hashCode());
        result = 37 * result + (lastName == null ? 0 : lastName.hashCode());
        return result;
    }
}
