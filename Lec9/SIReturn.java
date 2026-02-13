import java.util.Scanner;

class SIReturn {

    // function with return type
    double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Rate: ");
        double r = sc.nextDouble();

        System.out.print("Time: ");
        double t = sc.nextDouble();

        SimpleInterestReturn obj = new SimpleInterestReturn();
        double result = obj.calculateSI(p, r, t);

        System.out.println("Interest = " + result);
    }
}
