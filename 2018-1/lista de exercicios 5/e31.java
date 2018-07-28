import java.util.Scanner;
public class e31{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme 10 valores inteiros: ");
        int k [] = new int [10];
        for(int x=0; x<10; x++){
            k[x]=in.nextInt();
        }
        int cont=0;
        int l [] = k;
        for(int x=0; x<10; x++){
            if(x==0){
                l[x]=k[x];
            }
            else{
                for(int y=x-1; y>=0; y--){
                    if(k[x]==l[x]){
                        cont++;
                        break;
                    }
                }
                if(cont==0){
                    l[x]=k[x];
                }
                cont=0;
            }
        }
        for(int x=0; x<10; x++){
            System.out.println(l[x]);
        }
    }
}