import java.util.Scanner;
public class fatorial{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int valor;
        do{
            System.out.println("Informe um valor natural: ");
            valor=in.nextInt();
        }while(valor<0);
        double fat=1;
        for(int cont=valor;cont>1;cont++)
        {
            fat=fat*cont;
        }
        System.out.println("Fatorial de "+valor+" é "+fat);
    }
}