import java.util.Scanner;
public class e1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme o raio da esfera:");
        double raio = in.nextDouble();
        app1 e1 = new app1(raio);
        System.out.println("Volume da esfera: "+e1.volume());
        System.out.println("Área do raio: "+e1.area());
    }
}