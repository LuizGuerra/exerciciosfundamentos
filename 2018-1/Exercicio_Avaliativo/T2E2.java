import java.util.Scanner;
public class T2E2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\fInforme uma frase: ");
        String frase = in.nextLine();
        
        System.out.println("Indique a repetição: ");
        String repete = in.next();
        
        frase=frase.toLowerCase();
        repete=repete.toLowerCase();
        
        System.out.println("Iteratividade - Nº de repetições: "+ iterativo(frase,repete));
        System.out.println("Recursão - Nº de repetições: "+recursao(frase, repete, frase.length()-repete.length()));
    }
    public static int iterativo(String frase,String repete){
        int cont = repete.length();
        int y = 0;
        String substr; 
        for(int x=0;x<=(frase.length()-repete.length()); x++){
             substr = frase.substring(x,cont+x);
             if(substr.equals(repete)){y++;}
        }
        return y;
    }
    public static int recursao(String frase, String repete, int x){
        int y = 0;
        String substr; 
        if(x==0){
            substr = frase.substring(0,repete.length());
            if(substr.equals(repete)){y++;}
            return y;
        }
        substr = frase.substring(x,x+repete.length());
        if(substr.equals(repete)){y++;}
        y=y+recursao(frase, repete, x-1);
        return y;
    }
}