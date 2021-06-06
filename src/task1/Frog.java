package task1;

public class Frog extends Animal {
    public Frog(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    void makeSound() {
        System.out.println("kva-kva");
    }

    @Override
    void eat(String food) {
        System.out.println("Eating: " + food);
    }
}
