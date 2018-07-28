import java.util.Scanner;
public class ex6{
    public static void main (String [] Batman){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme trinta temperaturas em Farenheint");
        int a=1;
        while (a<=30){
            System.out.println("Temperatura nº "+a);
            double f = in.nextDouble();
            System.out.println("A temperatura nº "+a+" em Célsius é "+c(f));
            System.out.println("");
            a++;
        }
    }
    public static double c(double f){
        return (f-32)*5/9;
    }
}
