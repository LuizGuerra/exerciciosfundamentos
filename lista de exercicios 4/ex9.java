import java.util.Scanner;
public class ex9{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme 3 notas: ");
        System.out.println("Nota 1: ");
        double x = in.nextInt();
        System.out.println("Nota 2: ");
        double y = in.nextInt();
        System.out.println("Nota 3: ");
        double z = in.nextInt();
        System.out.println("A média ponderada das três notas é: "+media(x,y,z));
    }
    public static double media(double x, double y, double z){
        if(z>=x || y<=z){return (5*z+2.5*(x+y))/10;}
        return maior(x,y,z);
    }
    public static double maior(double x, double y, double z){
        if(x>=y || x>=z){
            return (5*x+2.5*(y+z))/10;
        }
        return (5*y+2.5*(x+z))/10;
        }
    }