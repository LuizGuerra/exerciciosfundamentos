import java.util.Scanner;
public class e4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme a altura do bico da garrafa: ");
        double altB = in.nextInt();
        System.out.print("Informe o raio do bico da garrafa: ");
        double corB = in.nextInt();
        System.out.print("Informe a altura do corpo da garrafa: ");
        double altC = in.nextInt();
        System.out.print("Informe a raio do corpo da garrafa: ");
        double corC = in.nextInt();
        System.out.print("Informe a altura total da garrafa: ");
        double altT = in.nextInt();
        app4 e1 = new app4(altB, corB, altC, corC, altT);
        System.out.println("O volume da garrafa é de "+e1.volume()+ " litros.");
    }
}