import java.util.Scanner;

public class multiplyoutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your first number?");
        int firstNum = scan.nextInt();

        System.out.println("What's your secondnumber?");
        int secondNum = scan.nextInt();

        System.out.println("By the power of Java the product IS: " + firstNum * secondNum);
    }
}