import java.util.Scanner;
public class TENTATIVA{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme uma frase: ");
        String frase = in.nextLine();
        System.out.println("");
        System.out.println("Tamanho total da Frase: " +frase.length());
        System.out.println("");
        String[] strList = frase.split(" ");
        String inverso="";
        for (int x = 0; x<= strList.length-1; x++){
            System.out.println("Palavra: '"+strList[x]+"', Letras: " + strList[x].length());
            System.out.println("String ao contrário: "+ nome(strList[x]));
            System.out.println("");
        }
        //System.out.println("");
    } 
    public static String nome(String nome){
        String nomeI = "";
        int tamanho = nome.length();
        for(int x=tamanho-1; x>=0; x--){
            nomeI += nome.charAt(x);
        }
        return nomeI;
    }
}