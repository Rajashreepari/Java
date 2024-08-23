class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }
}

abstract class AbstractClass {
    public abstract void display();
}

class Child extends AbstractClass {
    public Parent parent;

    public Child(String name) {
        this.parent = new Parent(name);
    }

    public void display() {
        System.out.println("Name: " + parent.name);
    }
}

public class Test_keyword {
    public static void main(String[] args) {
        Child child = new Child("Charlie");
        child.display();
    }
}
