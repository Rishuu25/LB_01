package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Title: ");
        String title = scanner.next();

        System.out.println("Enter the value for Width: ");
        int W = scanner.nextInt();

        System.out.println("Enter the value for Height: ");
        int H = scanner.nextInt();

        JFrame frame = new JFrame();
        frame.setSize(W,H);
        frame.setTitle(title);
        frame.setVisible(true);


    }
}
