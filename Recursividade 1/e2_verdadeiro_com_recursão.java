import java.util.Scanner;
public class e2_verdadeiro_com_recursão{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um valor inteiro e positivo: ");
        int valor = in.nextInt();
        int soma=valor;
        while(valor<0){
            System.out.println("Valor dado incorreto. Informe um valor inteiro e positivo: ");
            valor = in.nextInt();
        }
        System.out.println("A soma de todos os números naturais até o número oferecido é: " + nao(valor));
    }
    public static int nao(int valor){
        if(valor==1)return 1;
        return (valor+(nao(valor-1)));
    }
}