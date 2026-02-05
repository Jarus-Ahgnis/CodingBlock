import java.util.Scanner;
class max3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        if(x>y && x>z){
            System.out.println(x+ "is greatest");
        }else if(y>z && y>x){
            System.out.println(y+ " is greatest");
        }else{
            System.out.println(z+ " is greatest");
        }
        sc.close();
    }
} 

//sum of n natural no
// print even no from 1 to 1000
// print sum of even number from 1` to 1000
// multiplication table of 7
// Revrese of a number
//  example = 123
//    output = 321