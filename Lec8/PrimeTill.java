import java.util.Scanner;

public class PrimeTill{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Loop from 2 to n
        for(int i = 2; i <= n; i++) {

            boolean isPrime = true;

            // Check if i is prime
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print if prime
            if(isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
