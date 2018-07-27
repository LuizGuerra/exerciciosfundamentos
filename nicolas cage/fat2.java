import java.util.Scanner;
public class fat2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int valor;
        int x=in.nextInt();
        do{
            do{
                System.out.println("\fInforme um valor natural: ");
                valor=in.nextInt();
            }while(valor<0);
            System.out.println("Divisores de "+valor+": ");
            for(int d=1;d<=valor;d++){
                if(valor% d == 0) {System.out.println(d);}
            }
    }while(x=1);
    }
}