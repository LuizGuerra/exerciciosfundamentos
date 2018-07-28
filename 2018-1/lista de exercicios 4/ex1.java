import java.util.Scanner;
public class ex1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println("A média aritmética desses números é: "+media(x,y,z));
    }
    public static double media(int x, int y, int z){
        return (x+y+z)/3;
    }
}
