package Q_09;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        int length = text.length();
        String first_letter = text.substring(0,1);
        String last_letter = text.substring(length-1);

        System.out.println(length);
        System.out.println(first_letter);
        System.out.println(last_letter);
    }
}
