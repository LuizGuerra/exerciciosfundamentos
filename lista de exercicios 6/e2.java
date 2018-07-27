import java.util.Scanner;
public class e2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme a altura do retângulo:");
        double alt = in.nextDouble();
        System.out.print("Informe a base do retângulo:");
        double base = in.nextDouble();
        app2 e1 = new app2(alt, base);
        System.out.println("Perímetro do retângulo: "+e1.per());
        System.out.println("Área do retângulo: "+e1.area());
    }
}