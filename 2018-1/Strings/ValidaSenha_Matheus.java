import java.util.Scanner;
public class ValidaSenha_Matheus {
    public static int pontuaSenha(String senha){
        validaSenha(senha);
        int pontos=0;
        for(int i=0; i<senha.length(); i++){
            pontos +=1;
        }
        return pontos;
    }
    public static int verificaSenha(String senha){
        int contMax=0, contMin=0, contEspecial=0, contDig=0;
        if(senha.length()>6){
	        for(int i=0; i<senha.length(); i++){
	            char caractere = senha.charAt(i);
	            if(caractere>='A' && caractere<='Z'){
	                contMax++;
	            }
	            if(caractere>='a' && caractere<='z'){
	                contMin++;
	            }
	            if(caractere=='@' || caractere=='$' || caractere=='#' || caractere=='_'){
	                contEspecial++;
	            }
	            if(caractere>='0' && caractere<='9'){
	                contDig++;
	            }
	        }
        }  
        int especial=0, mM=0;
        if(contEspecial>0){ especial=10; }
        if(contMax>0 && contMin>0){ mM=15; }
        int pontuacao = (contDig*3) + especial + mM;
        return pontuacao;
    }
    public static void validaSenha(String senha){
        if(senha.length()<6){System.out.println("Senha muito fraca!\nPontuação da senha: 0");}
    }
    public static void requereSenha() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua senha: ");
        String senha = in.nextLine();
        int pontos = pontuaSenha(senha) + verificaSenha(senha);
        System.out.println("Sua senha foi avaliada com: " + pontos + " pontos." );
        validaSenha(senha);
     }
    public static void main (String args[]){
        requereSenha();
    }
}