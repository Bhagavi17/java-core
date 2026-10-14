
class Dog {
    String name = "Rocky";

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class oop {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        System.out.println(d1.name);
        d1.bark();
    }
}
