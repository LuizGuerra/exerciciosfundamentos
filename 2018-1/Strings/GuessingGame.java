import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
class GuessingGame {
     public static void main(String args[]) {
         Scanner keyboard = new Scanner(System.in);
         System.out.println("\fPress 15 to stop");
         System.out.println(" ███████╗██╗    ██╗███████╗███████╗███████╗██╗███╗   ██╗ ███████╗       ███████╗ █████╗ ███╗   ███╗███████╗");
         System.out.println("██╔═════╝██║    ██║██╔════╝██╔════╝██╔════╝██║████╗  ██║██╔═════╝      ██╔═════╝██╔══██╗████╗ ████║██╔════╝");
         System.out.println("██║ ████╗██║    ██║█████╗  ███████╗███████╗██║██╔██╗ ██║██║ ████╗      ██║ ████╗███████║██╔████╔██║█████╗  ");
         System.out.println("██║ ╚═██║██║    ██║██╔══╝  ╚════██║╚════██║██║██║╚██╗██║██║ ╚═██║      ██║ ╚═██║██╔══██║██║╚██╔╝██║██╔══╝  ");
         System.out.println("╚███████║╚███████╔╝███████╗███████║███████║██║██║ ╚████║╚███████║      ╚███████║██║  ██║██║ ╚═╝ ██║███████╗");
         System.out.println("╚══════╝ ╚══════╝ ╚══════╝╚══════╝╚══════╝╚═╝╚═╝  ╚═══╝ ╚══════╝       ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝");
         int x=1;
         while(x!=15){
             System.out.print("Enter an number from 1 to 10: ");
             x = keyboard.nextInt();
             int randomNumber = new Random().nextInt(10) + 1;
             if (x == randomNumber) {
                 out.println("**********");
                 out.println("*You win.*");
                 out.println("**********");
             } else {
                 out.println("You lose.");
                 out.println("The random number was ");
                 out.println(randomNumber + ".");
             }
             out.println("Thank you for playing.");
             out.println("");
        }
     }
}