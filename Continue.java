
public class Continue {
	public static void main(String[] args) {
     int name = 0;
     while(name<100){
         ++name;
       if(name%2==0){
           continue;
       }
         System.out.println(name);
         
     }
	}
}
