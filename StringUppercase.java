package Assignment;
import java.util.Scanner;
public class StringUppercase {
    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        input = scanner.next();
        char[] c = input.toCharArray();

        int length = c.length;
        for (int i = 0; i < length; i++) {

            if (c[i] >= 'a' && c[i] <= 'z') {

                c[i] = (char) (c[i] - 32);
            }
            System.out.print(c[i]);

        }
    }
}
