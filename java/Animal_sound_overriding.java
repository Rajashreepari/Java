class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("dog barks");
    }
}

public class Animal_sound_overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        myAnimal.makeSound();
        myDog.makeSound();
    }
}
