package task1;

abstract class Animal {
    private int age;
    private String name;
    private String gender;

    public Animal(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    abstract void makeSound();
    abstract void eat(String food);

   @Override
    public String toString() {
        return "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'';
    }

}

