import java.util.Scanner;
public class e21{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme 10 valores inteiros:");
        int valor [] = new int [10];
        for(int x=0; x<10; x++){
            System.out.print((x+1)+"º valor: ");
            valor[x]=in.nextInt();
        }
        int y=valor[9];
        for(int x=9; x>=0; x--){
            if(x==0){
                valor[x]=y;
            }
            else{
                valor[x]=valor[x-1];
            }
        }
        for(int x=0; x<10; x++){
            System.out.print((x+1)+"º valor: "+valor[x]);
            System.out.println();
        }
    }
}