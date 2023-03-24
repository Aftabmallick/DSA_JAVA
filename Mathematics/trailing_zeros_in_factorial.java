import java.util.Scanner;

class trailing_zeros_in_factorial {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no: ");
        int number = sc.nextInt();
        for (int i = 5; i <= number; i = i * 5) {
            res += number / i;
        }
        System.out.println("No of trailing zeros: " + res);
    }
}