// Jack is always excited about Sundays so every timee when the month starts he counts the number of sundays
// he will get considering the month can start with an any day.
// yor task is to count no.of.sundays Jack will  get within n no.of.days.

import java.util.Scanner;
public class no_of_sundays_withinGivenDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = sc.nextLine().toLowerCase();
        System.out.print("Enter no of days: ");
        int no_of_days = sc.nextInt();
        int i;
        int count = 0;
        switch (day) {
            case "monday":
                i = 1;
                while(i <= no_of_days+1){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            case "tuesday":
                i = 2;
                while(i <= no_of_days+2){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            case "wednesday":
                i = 3;
                while(i <= no_of_days+3){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            case "thursday":
                i = 4;
                while(i <= no_of_days+4){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            case "friday":
                i = 5;
                while(i <= no_of_days+5){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            case "saturday":
                i = 6;
                while(i <= no_of_days+6){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            case "sunday":
                i = 7;
                while(i <= no_of_days+7){
                    if(i % 7 == 0){
                        count++;
                    }
                    i++;
                }
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println(count);
        sc.close();
    }
}
