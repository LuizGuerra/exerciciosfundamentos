
public class teste{
    public static void main(String args[]){
        String nome = "Luiz Pedro";
        System.out.println("\fTamanho da String: " + nome.length());
        String nome_substring = nome.substring(0, 4);
        System.out.println("Primeira substring: "+nome_substring);
        nome_substring=nome.substring(5, nome.length());
        System.out.println("Segunda substring: "+nome_substring);
        //System.out.println("");
    }
}