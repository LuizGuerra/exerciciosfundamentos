import java.util.Scanner;
public class ex26{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um valor inteiro e não negativo: ");
        int valor = in.nextInt();
        while(valor<0){
            System.out.println("Valor negativo informado. Por favor, informe um valor positivo.");
            valor = in.nextInt();
            System.out.println("");
        }
        System.out.println("O número "+ corda(valor));
    }
    public static String corda(int valor){
        int y=0, x;
        for(x=1; x<=valor; x++){
            if(valor%x==0){y++;}
            x++;
        }
        if(y==2) {
            return "é primo";
        }
        return "não é primo";
    }
}