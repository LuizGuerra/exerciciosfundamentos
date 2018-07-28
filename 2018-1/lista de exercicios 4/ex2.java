import java.util.Scanner;
public class ex2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme 3 valors:");
        System.out.println("1º valor: ");
        double x = in.nextDouble();
        System.out.println("2º valor: ");
        double y = in.nextDouble();
        System.out.println("3º valor: ");
        double z = in.nextDouble();
        System.out.println("O maior número informado é: "+maior(x,y,z));
    }
    public static double maior(double x, double y, double z){
        if(x>=y || x>=z) {return x;}
        if(y>=x || y>=z) {return y;}
        return z;
    }
}