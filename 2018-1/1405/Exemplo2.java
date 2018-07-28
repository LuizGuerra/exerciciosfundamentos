import java.io.File; //Necessário para trabalhar com arquivos (File)
import java.io.FileNotFoundException; //Necessário em razão da excessão gerada quando o arquivo não é encontrado.
import java.io.PrintWriter; //Necessário para gravar em arquivo
import java.util.Scanner; //Necesário para leitura de arquivos
public class Exemplo2
{
    public static void main(String args[]) throws FileNotFoundException {
       Scanner teclado = new Scanner(System.in);
       processaFrutas("frutas.txt","frutasComA.txt");
   }
   public static void processaFrutas(String entrada, String saida)throws FileNotFoundException {
       File origem = new File(entrada);
       Scanner arquivo = new Scanner(origem);
       PrintWriter destino = new PrintWriter(saida);
       while(arquivo.hasNextLine()){
           String linha = arquivo.nextLine();
           //item 1 do exercicio 1
           if(iniciaComA(linha)==true) destino.println(linha);
          }
       arquivo.close();
       destino.close();
   }
   public static boolean iniciaComA(String texto){
       if(texto.charAt(0)=='A'|| texto.charAt(0)=='a') return true;
       return false;
   }
}