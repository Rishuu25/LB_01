package Q_02;
import javax.swing.*;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firtsname = scanner.next();
        System.out.println("Enter last name: ");
        String lastname = scanner.next();
        System.out.println(firtsname + " "+  lastname);

        JFrame frame = new JFrame();
        frame.setSize(300,150);
        frame.setTitle(firtsname + " " + lastname);
        frame.setVisible(true);

    }
}
