import java.util.Scanner;

public class Lot1{
   public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
  
    if(n>=300 && n <=460){
	if (n>=300 && n<=380){
        	System.out.println("You won a M1 Mac");
	}
	else{
        	System.out.println("You won a M2 Mac");
	}
    }
    else if(n>=200 && n <=280){
	if (n>=200 && n<=240){
        	System.out.println("You won a Chilli Fav Kurkure");
	}
	else{
        	System.out.println("You won a Onion Fav Kurkure");
	}
      
    }
    else if(n>=1100 && n <=1500){
      if (n>=1100 && n<=1300){
        	System.out.println("You won a Avon cycle");
	}
	else{
        	System.out.println("You won a Hero cycle");
	}

    }
    else if(n>=50 && n<=80){
      if (n>=50 && n<=65){
        	System.out.println("You won a Bullet");
	}
	else{
        	System.out.println("You won a Rajdoot");
	}

    }
    else{
      System.out.println("Better luck next time");
    }
     sc.close();
   }

}
