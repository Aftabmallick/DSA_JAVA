import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter max range : ");
        int n= sc.nextInt();
        boolean isprime[]=SieveofEratosthenes(n);
        for(int i=0;i<=20;i++){
            System.out.println(i+" "+isprime[i]);
        }
        sc.close();
    }
    static boolean[] SieveofEratosthenes(int n){
        boolean isprime[] = new boolean[n+1];
        Arrays.fill(isprime, true);
        isprime[0]=false;
        isprime[1]=false;
        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isprime[j]=false;
            }
        }
        return isprime;
    }
}
