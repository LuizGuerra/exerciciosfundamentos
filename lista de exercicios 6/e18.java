import java.util.Scanner;
public class e18{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme quantos números deseja informar: ");
        int qt = in.nextInt();
        int num [] = new int [qt];
        for(int x=0; x<qt; x++){
            System.out.println("Informe o "+(x+1)+"º número (inteiro) de 4 dígitos: ");
            num[x]=in.nextInt();
            while(num[x]<1000 || num[x]>9999){
                System.out.print("Número inválido. Informe outro número de 4 dígitos: ");
                num[x]=in.nextInt();
            }
        }
        app18 e1 = new app18(num, qt);
        for(int x=0; x<qt; x++){
            System.out.print("O "+(x+1)+"º número possui a característica? "+e1.caracteristica()[x]);
            System.out.println();
            System.out.print("O "+(x+1)+"º número é capicua? "+e1.capicua()[x]);
            System.out.println();
        }
    }
}