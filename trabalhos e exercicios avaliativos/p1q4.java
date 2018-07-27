import java.util.Scanner;
public class p1q4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("\fInforme um número positivo e inteiro: ");
        int valor = input.nextInt();
        if(valor<0)System.out.println("Valor dado incorreto.");
        else{
            if ((double)valor%2==0){
                int soma = 0;
                for(int d=1;d<=valor/2;d++){
                    if(valor%d==0) soma=soma+d;
                }
                if(soma==valor){System.out.println("Perfeito.");}
                else System.out.println("Não é perfeito.");
            }
            else{
                int cont=0;
                for(int d=1;d<=valor;d++){
                    if(valor%d==0)cont++;
                }
                if(cont==2) System.out.println("Primo");
                else System.out.println("Não é primo");
            }
        }
    }
}