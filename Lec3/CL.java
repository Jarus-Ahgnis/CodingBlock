import java.util.Scanner;

 public class CL{
	public static void main(String[]args){
		
 	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the x1,x2 and x3 values: ");
	int x1 = sc.nextInt();
	int x2 = sc.nextInt();
	int x3 = sc.nextInt();


	System.out.println("Enter the y1,y2 and y3 values: ");
	int y1 = sc.nextInt();
	int y2 = sc.nextInt();
	int y3 = sc.nextInt();


        double m1 = (y2-y1)/(x2-x1);
	double m2 = (y3-y2)/(x3-x2);


        if (m1==m2){

		System.out.println("It is a straight line");	

	}else{
		System.out.println("Not a straight line");
         }
	
	sc.close();
        }


}