import java.util.Scanner;
public class guella{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDigite a frase: ");
        String str = in.nextLine();
        System.out.println("Digite a substring: ");
        String sub= in.nextLine();
        System.out.println("Quantidade de repetições: ");
        System.out.println("Iterativo: "+iterativo(str, sub));
        System.out.println("Recursão: "+recursao(str, sub));
    }
    public static int iterativo(String str, String sub){
        if(str.length()<sub.length()){return 0;}
        int soma=0, s=0;
        for(int i=0;i<(str.length()-sub.length());i++){
            //String string = str.substring(i,str)
        }
        int x=1;
        
        
        return soma;
    }
    public static int recursao(String str, String sub){
        int x=1;
        
        return x;
    }
}