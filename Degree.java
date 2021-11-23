import java.util.Scanner;
public class  Degree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float mark;
		System.out.print("Enter a Number From 0 to 100:");
		mark = scan.nextFloat();
		
		if (mark >=90 && mark<=100) {
		    System.out.println("A");
		
		}else if (mark >=80 && mark<=89) {
		    System.out.println("B");
		
		}else if (mark >=70 && mark<=79) {
		    System.out.println("C");
		
		}else if (mark >=60 && mark<=69) {
		    System.out.println("D");
		    
		}else if (mark >=0 && mark<=59) {
		    System.out.println("F");
		    
		}else{
		    System.out.println("Check the enterd number");
		    }
		}
	}
