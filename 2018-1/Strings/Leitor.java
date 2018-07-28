import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitor{
    public static void main(String args[]){
        try{
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            String linha;
            do{
                linha = br.readLine();
                if(linha!=null){
                    System.out.println("Lido = "+linha);
                    String [] palavras = linha.split(";");
                    System.out.println("Nova Linha //////////////////////////");
                    for(int i = 0; i<palavras.length; i++){
                        System.out.println("Palavra lida = "+palavras[i]);
                    }
                }
            }while(linha!=null);
        }
        catch(Exception erro){
            System.out.println("Erro");
        }
    }
}