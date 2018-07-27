import java.util.Scanner;
public class ex4main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um número inteiro e positivo: ");
        int valor = in.nextInt();
        System.out.println("Resultado: " + ex4met.equacao(valor));
    }
}