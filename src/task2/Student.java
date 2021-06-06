package task2;

public class Student extends Person {

    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return super.toString() + ". Course: " + course;
    }
}
