import java.util.Scanner;
public class ex23{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String opcao = "sim";
            while (opcao.equals("sim")){
                System.out.println("\fInforme um valor inteiro e não negativo: ");
                int valor = in.nextInt();
                while(valor<0){
                    System.out.println("Valor negativo informado. Por favor, informe um valor positivo.");
                    valor = in.nextInt();
                }
                System.out.println("Fatorial do número dado é: "+fat(valor));
                System.out.println("Se deseja tentar de novo, escreva sim. Se não, digite qualquer coisa que não seja sim.");
                opcao = in.next();
        }
    }
    public static int fat(int valor){
        int som=1, x=1;
        for(x=valor; x>1; x--){
            som = som*x;
        }
        return som;
    }
}