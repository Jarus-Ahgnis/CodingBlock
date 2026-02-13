import java.util.Scanner;

class SumNaturalVoid {

    // void function
    void Sum(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SumNaturalVoid obj = new SumNaturalVoid();
        obj.Sum(n);
    }
}
