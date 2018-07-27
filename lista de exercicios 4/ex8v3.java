import java.util.Scanner;
public class ex8v3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um número natural de 4 dígitos: ");
        String valor = in.nextLine();
        System.out.println("O número ao contrário é "+cont(valor));
    }
    public static String cont(String valor){
        int size = valor.length()-1;
        if(size==0) return valor;
        return valor.charAt(size)+cont(valor.substring(0,size));
    }
}
