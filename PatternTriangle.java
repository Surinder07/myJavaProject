package Assignment;
import java.util.Scanner;
public class PatternTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
