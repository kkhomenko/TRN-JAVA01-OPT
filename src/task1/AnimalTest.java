package task1;

public class AnimalTest {

    public static void main(String[] args) {

//        Initialize instances of each animal
//        Set common characteristics for each initialized instance (name, age and gender)
//        Print to console name, age, and gender of each initialized animal
//        Print to console corresponding sound each one makes by invoking corresponding method of target class
//        In the same way, tell each animal to eat some food

        Dog charlie = new Dog(1, "Charlie", "F");
        System.out.println(charlie);
        charlie.makeSound();
        charlie.eat("Meat");

        Frog froggy = new Frog(2, "Froggy", "M");
        System.out.println(froggy);
        froggy.makeSound();
        froggy.eat("fly");

        Cat kitty = new Cat(1, "Kitty", "F");
        System.out.println(kitty);
        kitty.makeSound();
        kitty.eat("mouse");

        Mouse mickey = new Mouse(1, "Mickey", "M");
        System.out.println(mickey);
        mickey.makeSound();
        mickey.eat("cereal");

    }
}
