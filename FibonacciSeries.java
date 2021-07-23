package Assignment;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range you want to print");

        int fib = scanner.nextInt();
        int n1=0, n2=1, n3=0;
        System.out.print(n1+"\t"+n2);

        for(int i = 0;i <fib;i++){

            n3 = n1+n2;
            System.out.print("\t"+n3);
            n1= n2;
            n2=n3;
        }
    }
}

