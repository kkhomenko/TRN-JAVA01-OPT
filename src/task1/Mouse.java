package task1;

public class Mouse extends Animal {
    public Mouse(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    void makeSound() {
        System.out.println("Squick-squick");

    }

    @Override
    void eat(String food) {
        System.out.println("Eating: " + food);

    }
}
