import java.util.Scanner;
public class e25{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme 10 valores inteiros:");
        int k [] = new int [10];
        for(int x = 0; x<10; x++){
            System.out.print((x+1)+ "º valor: ");
            k[x]=in.nextInt();
        }
        boolean p [] = new boolean [10];
        int cont=0;
        for(int x = 0; x<10; x++){
            for(int y=1; y<=k[x]; y++){
                if(k[x]%y==0){
                    cont++;
                }
            }
            if(cont==2){
                p[x]=true;
            }
            else{
                p[x]=false;
            }
            cont=0;
        }
        System.out.println("\nVerificação dos números primos:");
        for(int x = 0; x<10; x++){
            System.out.print("\n"+(x+1)+"º valor, "+k[x]+": "+p[x]);
        }
    }
}