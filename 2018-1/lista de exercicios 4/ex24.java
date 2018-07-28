import java.util.Scanner;
public class ex24{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme um valor inteiro e não negativo: ");
        int valor = in.nextInt();
        while(valor<0){
            System.out.println("Valor negativo informado. Por favor, informe um valor positivo.");
            valor = in.nextInt();
        }
        System.out.println("Os divisores do número "+valor+" são:"+div(valor));
    }
    public static String div(int valor){
        String vala = "";
        for(int x=1; x<=valor; x++){
            if(valor%x==0){vala = vala +(" "+x);}
        }
        return vala;
    }
}