import java.util.Scanner;
public class p2e1{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        double alt [] = new double [200];
        for(int x=0; x<200; x++){
            System.out.print("Informe a nota do jogador nº "+(x+1)+": ");
            alt [x] = in.nextDouble();
        }
        System.out.print("A moda da altura é "+moda(alt));
    }
    public static double moda(double [] alt){
        int cont = 0;
        int contM = 0;
        double altM = 0;
        for(int x=0; x<200; x++){
            for(int y=x; y<200; y++){
                if(alt[y]==alt[x]){
                    cont++;
                }
            }
            if(cont>contM){
                contM=cont;
                altM=alt[x];
            }
            cont=0;
        }
        return altM;
    }
}