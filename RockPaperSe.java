import java.util.Random;
import java.util.Scanner;

public class RockPaperSe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //this is a random letter
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            //get the input from the scanner as string. [ User Input w3schools ]
             String play =scan.nextLine();
            //convert the string to lower case by using toLowerCase() [ String w3schools ]
            play = play.toLowerCase(); 
            //get first char by using charAt() [ String w3schools ]
              char abdullh = play.charAt(0); 
             
            //check the first char if it is not r, p, and s then break the loop [ if w3schools ]
               if(abdullh !='r' && abdullh !='p' && abdullh != 's' ){
                //use break keyword [ while w3schools ]
              break; 
               }
            //here is the computer choice
              char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            //check & match who wins
            
            if((abdullh =='p' && computerChoice =='s')
                ||(abdullh =='s'&& computerChoice=='r')
                ||(abdullh =='r'&& computerChoice =='p')) {
                    
                        System.out.println("abdullh win");
            
                
                }else if ( abdullh == computerChoice ){
                System.out.println("tie");
                
                }else {
                    System.out.println("computerChoice");
                }
         

            //print new line
            System.out.println("\n\n");
        }while(true);
    }
}
