import java.util.Scanner;
public class s_charAt{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fEscreva algo: ");
        String s1 = in.next();
        
        System.out.println("O primeiro dígito é: " + s1.charAt(0) );
        System.out.println("O segundo dígito de batata é: "+ "batata".charAt(1));
        
        //System.out.println("");
        // char charAt(int k)
        //s1.toUpperCase();
        //s1 = s1.charAt(2).toUpperCase();
        
        String aux = s1;
        char[] list = aux.toCharArray(); 
        
        aux = "" + list[2];
        aux = aux.toUpperCase();
        list[2] = aux.charAt(0);
        
        aux = "";
        for(int i = 0;i<=list.length-1;i++){
            aux += ""+ list[i];            
        }
        System.out.println(aux);
    }
}