abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Animal_Dynamicmethod {
    public static void printSound(Animal a) {
        a.makeSound();
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal() {
            void makeSound() {
                System.out.println("Animal makes a sound");
            }
        };

        Animal myDog = new Dog();
        printSound(myAnimal);
        printSound(myDog);
    }
}
