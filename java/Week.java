import java.util.Scanner;

class Week {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("enter the no:(1,2,3,4,5,6,7)");
        String opt = day.next();
        switch (opt) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thurday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input: please enter the number between 1 and 7.");
        }
    }
}