class Person {
    public String name(String name) {
        return name;
    }

    public int age(int age) {
        return age;
    }
}

class Employee extends Person {
    public String id(String id) {
        return id;
    }

    public String department(String dept) {
        return dept;
    }
}

public class employee_details {
    public static void main(String args[]) {
        Employee obj = new Employee();
        String name = obj.name("Alice");
        int age = obj.age(30);
        String id = obj.id("E123");
        String dept = obj.department("HR");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("EMployee ID:" + id);
        System.out.println("Department:" + dept);
    }
}
