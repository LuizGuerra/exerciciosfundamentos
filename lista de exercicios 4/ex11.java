import java.util.Scanner;
public class ex11{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("\fInforme seu saldo médio: ");
        double x = in.nextDouble();
        if (x<0) System.out.println("Valor incorreto. Tente novamente.");
        else{
            System.out.println("O valor do crédito recebido é "+cre(x)+ " reais");
    }
    }
    public static double cre(double x){
        if(x<=500){return 0;}
        else if(x<=1500){return x*10/100;}
        else if(x<=2500){return x*15/100;}
        else if(x<=4000){return x*20/100;}
        return x*25/100;
    }
}