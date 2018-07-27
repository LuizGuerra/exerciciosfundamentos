//import java.lang.String;
import java.util.Scanner;
public class devmedia1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int i;
        System.out.printf("\fCaracteres numéricos:\n");
        for (i=48; i<=57; i++) {
            System.out.printf("%c", i);
        }
        System.out.printf("\n\nCaracteres alfabéticos maiúsculos:\n");
        for (i=65; i<=90; i++) {
            System.out.printf("%c", i);
        }
    
        System.out.printf("\n\nCaracteres alfabéticos minúsculos:\n");
        for (i=97; i<=122; i++) {
            System.out.printf("%c", i);
        }
        System.out.printf("\n");
    }
}