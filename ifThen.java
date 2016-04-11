/**
 * Created by c4q-john on 3/5/15.
 */

import java.util.Scanner;

public class ifThen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me your password");

       int password = in.nextInt();

        if (password == 1234) {
            System.out.println("logged in.");
        }

    }

}
