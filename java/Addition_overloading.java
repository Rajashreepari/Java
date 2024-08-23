class calculation {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Addition_overloading {
    public static void main(String args[]) {
        calculation obj = new calculation();
        int add2 = obj.add(3, 5);
        int add3 = obj.add(3, 4, 7);
        double double_add = obj.add(2.5, 9.5);
        System.out.println("sum of two integres=" + add2);
        System.out.println("sum of three integres=" + add3);
        System.out.println("sum of two double values=" + double_add);
    }
}