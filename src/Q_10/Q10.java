package Q_10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        int length = text.length();

        int middle = (length/2);


        System.out.println(text.substring (middle,middle+1));

    }
}
