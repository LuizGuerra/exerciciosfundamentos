import java.io.FileOutputStream;
import java.io.PrintWriter;
public class Escritor_De_Arquivo_Teste_V2{
    public static void main(String args[]){
        System.out.print("\f");
        try{
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            
            pr.println("Até agora tudo certo. Mas vamos testar outro texto, shall we?");
            pr.println("");
            pr.println("Eae, funcionará? Hahaha");
            
            pr.close();
            arquivo.close();
            System.out.println("Sucesso");
        }
        catch(Exception error){
            System.out.println("Erro ao escrever o arquivo");
        }
    }
}