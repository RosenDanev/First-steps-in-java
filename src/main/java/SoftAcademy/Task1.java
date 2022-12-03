package SoftAcademy;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hellow! Please, enter your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("What is your hobby?");
        String hob = scanner.nextLine();
        System.out.println("Wow " + name +"!" + hob + " is fantastic!");

    }
}
