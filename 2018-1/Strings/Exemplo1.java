import java.io.File; //Necessário para trabalhar com arquivos (File)
import java.io.FileNotFoundException; //Necessário em razão da excessão gerada quando o arquivo não é encontrado.
import java.io.PrintWriter; //Necessário para gravar em arquivo
import java.util.Scanner; //Necesário para leitura de arquivos
public class Exemplo1{
   public static void main(String args[]) throws FileNotFoundException {
       Scanner teclado = new Scanner(System.in);
       System.out.print("Informe o nome do arquivo: ");
       String nomeArquivo = teclado.nextLine();
       gravacao(nomeArquivo);
       leitura(nomeArquivo);    
   }
   public static void gravacao(String nomeArquivo)throws FileNotFoundException {
       Scanner teclado = new Scanner(System.in);
       PrintWriter arquivo = new PrintWriter(nomeArquivo);
       
       System.out.print("Informe um valor inteiro positivo (use negativo para encerrar): ");
       int numero = teclado.nextInt();
       while(numero>0) {
           arquivo.println(numero);
           System.out.print("Informe um valor inteiro positivo (use negativo para encerrar): ");
           numero = teclado.nextInt();
       }
       arquivo.close();
   }
   public static void leitura(String nomeArquivo)throws FileNotFoundException {
       File origem = new File(nomeArquivo);
       Scanner arquivo = new Scanner(origem);
       int total = 0;
       while(arquivo.hasNextLine()){
           String linha = arquivo.nextLine();
           System.out.println(linha);
           int valor = Integer.parseInt(linha);
           total = total + valor;
       }
       arquivo.close();
       System.out.println("Total: " + total);
   }
} 
//smutstone.com