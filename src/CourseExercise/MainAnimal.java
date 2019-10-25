package CourseExercise;

public class MainAnimal {
    public static void main(String[] args) {


        Animal animal = new Animal("animal1", 1, 1, 5, 5);
        Dog dog = new Dog("dogOne", 8, 20, 2, 4, 1, 25, "long");
        dog.eat();
        dog.run();

    }



}
