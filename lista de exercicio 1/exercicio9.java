import java.util.Scanner;
public class exercicio9{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\fInforme sua altura em metros: ");
        double h = input.nextDouble();
        double cm = (h*100);
        double mm = (h*1000);

        if (h>=0 && h<3){ 
            System.out.println("Sua altura em centímetros é " + cm);
            System.out.println("Sua altura em milímetros é " + mm);}
        else System.out.println("Não mente pra mim mizera! Hahahaha");
        
    }
}