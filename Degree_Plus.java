import java.util.Scanner;
public class Degree_Plus {
	public static void main(String[] args) {
	      Scanner d = new Scanner(System.in);
	      int degree = d.nextInt();
	      if(degree >=95 && degree <=100){
	          System.out.println("A+");
	      }else if (degree >= 90 && degree <=94){ 
	          System.out.println("A");
	      }else if (degree >=85 && degree <= 89){ 
	          System.out.println("B+");
	      }else if (degree >= 80 && degree <= 84){ 
	          System.out.println("B");
	      }else if (degree >= 75 && degree <=79){ 
	          System.out.println("C+");
	      }else if (degree >= 70 && degree <= 74){ 
	          System.out.println("C");
	      }else if (degree >= 65 && degree <= 69){ 
	          System.out.println("D+");
	      }else if (degree >= 60 && degree <= 64){ 
	          System.out.println("D");
	      }else if (degree >= 0 && degree <=59){ 
	          System.out.println("F");
	      }else{ 
	          System.out.println("Fill");
	      }
	
	}
}

