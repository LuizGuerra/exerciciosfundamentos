public class nome_ao_contrario{
    public static void main(String args[]){
        String nome = "";
        System.out.println();
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