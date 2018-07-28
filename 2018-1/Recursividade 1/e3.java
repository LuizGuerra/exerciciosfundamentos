import java.util.Scanner;
public class e3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDigite uma String qualquer: ");
        String entrada = in.next();
        System.out.println("A String "+entrada+" invertida é "+inverte(entrada));
    }
    public static String inverte(String entrada){
        String saida="";
        for(int i = entrada.length(); i>=0;i--){
            saida = saida + entrada.charAt(i);
        }
        return saida;
    }
}