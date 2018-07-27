import java.util.Scanner;
public class primo{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme um número inteiro e positivo: ");
        int num = in.nextInt();
        while(num<=0){
            System.out.println();
            System.out.print("Número informado negativo ou igual a zero. Informe um número inteiro e positivo: ");
            num = in.nextInt();
        }
        System.out.println("Números primos menores e/ou iguais ao número dado:");
        for(int x=1; x<=num;x++){
            int cont=0;
            for(int y=1; y<=x; y++){
                if(x%y==0){cont++;}
                if(x==y && cont==2){System.out.println(x);}
            }
        }
    }
}