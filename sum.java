import java.util.Scanner;

/**
 * sum
 */
public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(a+" + "+b+" = "+sum);
    }
}