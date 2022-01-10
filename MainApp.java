import java.sql.SQLOutput;

public class MainApp {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 3, "white");
        Dog dog = new Dog("Bobik", 3, "brown");
        Dog dogs[] = new Dog[5];
        for (int i = 0; i < 5; i++){
            dogs[i] = new Dog();
        }
        dog.swim(10);
        dog.run(400);
        dog.run(-2);
        dog.run(501);
        cat.swim(10);
        cat.run(150);
        cat.run(-2);
        cat.run(201);
        cat.setAge(-1);
        System.out.println(dogs[2].getName());
        System.out.println(cat.getAge());
        System.out.println("Animals exist: " + Animal.getCount());
        System.out.println("Dogs exist: " + Dog.getCount());
        System.out.println("Cats exist: " + Cat.getCount());
    }
}
