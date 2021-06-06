package task2;

public class Teacher extends Person {

    private String department;
    private int wage; //rate per hour
    private int totalHoursWorked;

    public Teacher(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public int getWage() {
        return wage;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public String getDepartment() {
        return department;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public int salary () {
        return this.wage * this.totalHoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ". Salary: " + salary();
    }
}
