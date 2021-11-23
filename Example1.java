import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark >= 90 ){ 
            System.out.println("A");
        }else if (mark >= 80){ 
             System.out.println("B");
        }else if (mark >=70){ 
             System.out.println("c");
        }else if (mark >=60){ 
            System.out.println("d");
        }else if (mark >=0){
            System.out.println("f");
        }else{ 
            System.out.println("e");
        /*
        ( 90 , 100 ) print A
        ( 80 , 90 ] print B
        ( 70 , 80 ] print c
        ( 60 , 70 ] print d
        ( 0 , 60 ] print f
         */
        }
    }
}
