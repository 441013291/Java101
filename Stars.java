public class Stars {
	public static void main(String[] args) {
	 int counterX = 5;
	 while(counterX >=1){
	     int counterY = 1;
	     while (counterY <=counterX){
	         System.out.print("*");
	         ++counterY;
	     }
	     System.out.println();
	     --counterX;
	    
	 }
	}
}
