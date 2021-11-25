import java.util.Scanner;
public class Corona {
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	    int Person = scan.nextInt();
	    
	if(Person > 38)
	System.out.println(" This person is not allowed to enter due to suspected infection with the Corona virus ");
	 else 
	 	System.out.println("The temperature is normal");
	}
}

