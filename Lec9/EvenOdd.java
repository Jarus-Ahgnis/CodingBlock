import java.util.Scanner;

class EvenOdd {

    public static int j(int a){
        return (a % 2 == 0) ? 1 : 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(j(a) == 1){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
