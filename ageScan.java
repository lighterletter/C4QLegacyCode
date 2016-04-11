package nyc.c4q.lighterletter.com.company;

/**
 * Created by c4q-john on 3/5/15.
 */

import java.util.Scanner;

public class ageScan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! How old are you?");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old. in five years, you will be " + (age+ 5) + " years old!");
    }
}