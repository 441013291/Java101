import java.util.Scanner;
public class squareWidthAndHeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Height , Width;

        System.out.println("Enter high :");
        Height = scan.nextFloat();
        System.out.println("Enter witdth :");
         Width = scan.nextFloat();

        System.out.println(Width * Height);
    }
}
