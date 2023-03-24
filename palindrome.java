import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int reverse = 0;
        int last_digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no: ");
        int number = sc.nextInt();
        int num=number;
        while (number > 0) {
            last_digit = number % 10;
            reverse = reverse * 10 + last_digit;
            number = number / 10;
        }
        if (num == reverse) {
            System.out.println(num + " is a Palindrome no");
        } else {
            System.out.println(num + " is not a Palindrome no");
        }
    }
}
