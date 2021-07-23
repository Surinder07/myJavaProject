package Assignment;
import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse");
        String input= scanner.next();
        char[] c = input.toCharArray();

        int length = c.length;
        for(int i = length-1; i >=0; i--)
        {
            System.out.print(c[i]);
        }

    }
}
