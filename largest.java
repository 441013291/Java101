import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int user1,user2,user3;

        System.out.println("Enter Number 1 : " );
        user1 = scan.nextInt();
        System.out.println("Enter Number 2 : " );
        user2 = scan.nextInt();
        System.out.println("Enter Number 3 : " );
        user3 = scan.nextInt();

        if(user1 > user2 && user1 > user3) {
            System.out.println("The Largest Number is" + user1);
        
        }else if (user2 > user1 && user2 > user3){
            System.out.println("The Largest Number is" + user2);
        
        }else if (user3 > user1 && user3 > user2) {
            System.out.println("The Largest Number is" + user3);
        }else{
             System.out.println("The numbers are even" );
        
        }
    }

}
