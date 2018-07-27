import java.util.Scanner;
public class Senha_Matheus{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua senha: ");
        String senha = in.nextLine();
        if(verifica6(senha)==0){System.out.println("Senha muito curta. 0 pontos");}
        else{System.out.println("Sua senha atingiu " + pontos(senha) + " pontos");}
    }
    public static int verifica6(String senha){
        if(senha.length()<6){return 0;}
        else{return 1;}
    }
    public static int pontos(String senha){
        int mM = 0, min = 0, max = 0, especial = 0, pontos = 0;
        for(int i=0;i<senha.length(); i++){
            if(senha.charAt(i)>=65 && senha.charAt(i)<=90){//Maiúsculas
                pontos += 1;
                max = 1;
            }
            if(senha.charAt(i)>=97 && senha.charAt(i)<=122){//Minúsculas
                pontos += 1;
                min = 1;
            }
            if(senha.charAt(i)>=48 && senha.charAt(i)<=57){//Números/dígitos
                pontos += 4;
            }
            if(senha.charAt(i)==35 || senha.charAt(i)==36 || senha.charAt(i)==64 || senha.charAt(i)==95){//Especiais
                especial = 10;
                pontos += 1;
            }
            if((max+min)==2){//Mistura de Miúsculas e Minúsculas
                mM = 15;
            }
        }
        return pontos+especial+mM;//Total de Pontos da Senha
    }
}