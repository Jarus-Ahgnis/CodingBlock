import java.util.Scanner;

class SIVoid {

    // void function
    void calculateSI(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Rate: ");
        double r = sc.nextDouble();

        System.out.print("Time: ");
        double t = sc.nextDouble();

        SIVoid obj = new SIVoid();
        obj.calculateSI(p, r, t);
    }
}
