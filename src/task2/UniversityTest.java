package task2;

public class UniversityTest {
    public static void main(String[] args) {

        //Initialize several students. Print their first name, last name and age and course that each of them learns.

        Student alex = new Student("Alex", "Kane", 21);
        alex.setCourse("Math");
        System.out.println(alex);

        Student mary = new Student("Mary", "Jane", 19);
        mary.setCourse("Art");
        System.out.println(mary);

        /* Initialize a few teachers. Set values for wage and total hours worked. Print their first name,
        last name, age and salary that each of them earns.
         */
        Teacher john = new Teacher("John", "Tob", 45);
        john.setDepartment("Computer science");
        john.setWage(20);
        john.setTotalHoursWorked(120);
        System.out.println(john);

        Teacher lizy = new Teacher("Lizy", "Simpson", 45);
        lizy.setDepartment("Philosophy");
        lizy.setWage(34);
        lizy.setTotalHoursWorked(12);
        System.out.println(lizy);

    }
}
