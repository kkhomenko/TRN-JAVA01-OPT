package task1;

public class Cat extends Animal{
    public Cat (int age, String name, String gender){
        super(age,name, gender);
    }

    @Override
    void makeSound() {
        System.out.println("Sound: meow-meow");
    }

    @Override
    void eat(String food) {
        System.out.println("Eating: " + food);

    }
}
