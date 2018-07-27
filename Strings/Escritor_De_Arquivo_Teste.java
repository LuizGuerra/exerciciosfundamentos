import java.io.FileOutputStream;
import java.io.PrintWriter;
public class Escritor_De_Arquivo_Teste{
    public static void main(String args[]){
        System.out.print("\f");
        try{
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            
            pr.println("Linha1 Coluna1 ; Linha1 Coluna2 ; Linha1 Coluna3");
            pr.println("Linha2 Coluna1 ; Linha2 Coluna2 ; Linha2 Coluna3");
            pr.println("Linha3 Coluna1 ; Linha3 Coluna2 ; Linha3 Coluna3");
            
            pr.close();
            arquivo.close();
            System.out.println("Sucesso");
        }
        catch(Exception error){
            System.out.println("Erro ao escrever o arquivo");
        }
    }
}