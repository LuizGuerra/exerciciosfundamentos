import java.util.Scanner;
public class exer9{
    public static void maid(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("\fDigite um valor inteiro: ");
        int a = in.nextInt();
        int aux=0, auy=0;
        while(a<0){
            System.out.println("Valor inválido. Digite um valor inteiro positivo");
            a=in.nextInt();
        }
        System.out.println("Digite outro valor inteiro ");
        int b = in.nextInt();
        while(b<0){
            System.out.println("Valor inválido. Digite um valor inteiro positivo");
            b=in.nextInt();
        }
        
        if(a==b)System.out.println("A soma dos pares entre "+a+ "e "+b+ " é: "+(0));
        else if(a<b){
            while(a!=b){
                if(a%2==0){aux=a+aux;}
                a++;
            }
            System.out.println("");
        }
        
        System.out.println("");
    }
}