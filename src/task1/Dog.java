package task1;

public class Dog extends Animal{

    public Dog(int age, String name, String gender){
        super(age, name, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("gav-gav");
    }

    @Override
    public void eat(String food) {
        System.out.println("Eating " + food);
    }

}
