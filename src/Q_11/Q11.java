package Q_11;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Firts name: ");
        String firstname = scanner.nextLine();

        System.out.println("Middle name: ");
        String middlename = scanner.nextLine();

        System.out.println("Lasts name: ");
        String lastname = scanner.nextLine();

        String initial = middlename.substring(0,1);

        System.out.println(lastname +", "+ firstname +" "+ initial + ".");

    }
}
