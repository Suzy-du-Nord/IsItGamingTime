package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("What day is it today?");
        String today = scanner.nextLine();

        System.out.println("When is the due date?");
        String dueDate = scanner.nextLine();

        for (int i = 0; i < days.length; i++) {

            if (today.equals(days[i])) {

                int toCheck = i;

                for (int n = 0; n < days.length; n++) {

                    if (dueDate.equals(days[i + 1])) {

                        System.out.println("gg");

                    } else {

                        System.out.println("If tomorrow's not the due date, today's not the do date.");

                    }

                    break;

                }
            }
        }
    }
}