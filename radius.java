import java.util.Scanner;
public class radius {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float radius1;

        System.out.println("Enter Radius of circle : ");
        radius1 = a.nextFloat();

        System.out.println(3.14 *  radius1 *  radius1);
    }
}
