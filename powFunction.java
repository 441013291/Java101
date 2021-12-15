import java.util.Scanner;
public class  powFunction {
    static int add(int y) {
        return y*y;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y;
        System.out.println("Enter the number");
        y= scan.nextInt();


        System.out.println(add(y));






    }
}
