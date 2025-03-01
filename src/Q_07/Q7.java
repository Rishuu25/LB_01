package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss a");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for Width: ");
        int W = scanner.nextInt();

        System.out.println("Enter the value for Height: ");
        int H = scanner.nextInt();



        JFrame frame = new JFrame();
        frame.setSize(W,H);
        frame.setTitle(sdf1.format(today));
        frame.setVisible(true);
    }
}
