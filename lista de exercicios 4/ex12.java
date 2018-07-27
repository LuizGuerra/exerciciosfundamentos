import java.util.Scanner;
public class ex12{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme as 3 notas:");
        System.out.println("Nota 1: ");
        double x = in.nextDouble();
        if(x<0 || x>10){System.out.println("Nota impossível. Tente novamente.");}
        else{
            System.out.println("Nota 2");
            double y = in.nextDouble();
            if(x<0 || x>10){System.out.println("Nota impossível. Tente novamente.");}
            else{
                System.out.println("Nota 3");
                double z = in.nextDouble();
                if(x<0 || x>10){System.out.println("Nota impossível. Tente novamente.");}
                else{
                    System.out.println("A média aritmética é: "+mA(x,y,z));
                    System.out.println("A média ponderada é: "+mP(x,y,z));
                    System.out.println("A média harmônica é: "+mH(x,y,z));
                }
        }
        System.out.println("");
    }
}
    public static double mA(double x, double y, double z){
        return (x+y+z)/3;
    }
    public static double mP(double x, double y, double z){
        return ((x*3)+(y*3)+(z*4))/10;
    }
    public static double mH(double x, double y, double z){
        return 3/((1/x)+(1/y)+(1/z));
    }
}
