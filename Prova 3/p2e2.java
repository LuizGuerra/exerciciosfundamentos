import java.util.Scanner;
public class p2e2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        double p1 [] = new double [60];
        double p2 [] = new double [60];
        for(int x = 0; x<60; x++){
            System.out.print("Informe a nota da P1 do aluno nº "+(x+1)+": ");
            p1[x]=in.nextDouble();
            System.out.print("Informe a nota da P2 do mesmo aluno: ");
            p2[x]=in.nextDouble();
            System.out.println();
        }
        for(int x = 0; x<60; x++){
            System.out.print("Média do aluno nº "+(x+1)+": "+media(p1,p2)[x]);
            System.out.println();
        }
    }
    public static double [] media(double [] p1, double [] p2){
        double media [] = new double [60];
        for(int x = 0; x<60; x++){
            media[x] = (p1[x] + p2[x])/2;
        }
        return media;
    }
}