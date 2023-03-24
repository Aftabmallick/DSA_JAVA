import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int factorialno=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no: ");
        int number = sc.nextInt();
        for(int i=number;i>0;i--){
            factorialno = factorialno*i;
        }
        System.out.println("Factorial = "+factorialno);
    }
}
