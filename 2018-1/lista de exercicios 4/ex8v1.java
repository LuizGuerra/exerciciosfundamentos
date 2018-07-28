
import java.util.Scanner;
public class ex8v1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um número natural de 4 dígitos: ");
        int valor = in.nextInt();
        System.out.println("O número ao contrário é "+cont(valor));
    }
    public static int cont(int valor){
        int m = valor/1000;
        System.out.println(m);
        int resto =valor-(m*1000);
        System.out.println(resto);
        int c = resto/100;
        System.out.println(c);
        resto = resto-(c*100);
        System.out.println(resto);
        int d = resto/10;
        System.out.println(d);
        int u =resto%10;
        System.out.println(u);
        return (u*1000)+(d*100)+(c*10)+m;
    }
}
