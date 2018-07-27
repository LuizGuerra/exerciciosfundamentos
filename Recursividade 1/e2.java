/**  Faça um programa que leia um valor inteiro e não negativo (garanta isso).
  *  Calcula e escreve o somatório desse valor.
  *  Para calcular o somatório use um método recursivo
  */
import java.util.Scanner;
public class e2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in); //System.out.println("");
        int z = 2;
        while(z< 3){
            System.out.println("Informe um valor inteiro e positivo: ");
            int num = in.nextInt();
            while(num<=0){
                System.out.println("Valor incorreto. Tente novamente.");
                num= in.nextInt();
            }
            System.out.println("Somatorio do nº " + num + ": ");
            System.out.println(somatorio(num));
        }
    }
    public static String somatorio(int num){
        int x=1, soma1=0, soma2=0;
        String somei = " --- ";
        while(x<=num){ 
            while (soma2<=num){
                soma1++;
                soma2=soma1+soma2;
                if (soma2==num){
                    soma1=x; soma2=0;
                    while (soma2 <= num){
                        somei = somei + ("-" + soma1);
                        soma1++;
                        soma2=soma1+soma2;
                    } // this shit is LIT SHIT
                    somei = somei + " --- ";
                }
            }
            x++;
            soma1=(x-1);
            soma2=0;
        }
        return somei;
    }
}