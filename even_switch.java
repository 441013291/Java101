import java.util.Scanner;
public class even_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
       int day = scan.nextInt();
        day %=2;

        switch (day) {
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
        }
    }
}
