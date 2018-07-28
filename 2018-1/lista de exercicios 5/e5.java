import java.util.Scanner;
public class e5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme quantos valores quer de fibonacci: ");
        int q = in.nextInt();
        int a=0, b=1;
        int fibo [] = new int [q];
        for(int x=1; x<q; x++){
            int soma = a+b;
            fibo[x-1]=soma; 
            a=b;
            b=soma;
        }
        for(int x=0; x<q; x++){
            System.out.println((x+1)+"º termo: "+fibo[x]);
        }
    }
}