package HomeTask;

import java.util.Scanner;

public class ScannerHomeTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = input.nextLine();
        System.out.println("this is my name" + name);

        System.out.println("please enter your last name");
        String lastname = input.nextLine();
        System.out.println("this is my last name" + lastname);

        System.out.println("please enter your address");
        String address = input.nextLine();
        System.out.println("this is my address" + address);

        System.out.println("please enter your average grade");
        String averagegrade = input.nextLine();
        System.out.println("this is my averagegrade" + averagegrade);

        System.out.println("please enter your age");
        String age = input.nextLine();
        System.out.println("this is my age" + age);


    }
}
