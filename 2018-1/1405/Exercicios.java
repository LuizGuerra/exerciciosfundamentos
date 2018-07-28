import java.io.File; //Necessário para trabalhar com arquivos (File)
import java.io.FileNotFoundException; //Necessário em razão da excessão gerada quando o arquivo não é encontrado.
import java.io.PrintWriter; //Necessário para gravar em arquivo
import java.util.Scanner; //Necesário para leitura de arquivos
public class Exercicios
{
    public static void main(String args[]) throws FileNotFoundException {
       Scanner teclado = new Scanner(System.in);
       // System.out.print("\fInforme o nome do arquivo: ");
       //String nomeArquivo = teclado.nextLine();  
       //leituraFrutas(nomeArquivo); 
       leituraReais();
   }
   public static void leituraFrutas(String nomeArquivo)throws FileNotFoundException {
       File origem = new File(nomeArquivo);
       Scanner arquivo = new Scanner(origem);
       while(arquivo.hasNextLine()){
           String linha = arquivo.nextLine();
           //item 1 do exercicio 1
          // if(iniciaComA(linha)==true) System.out.println(linha);
           //item 2 do exercicio 1
           if(contaA(linha)>=2) System.out.println(linha);
       }
       arquivo.close();
   }
   public static boolean iniciaComA(String texto){
       if(texto.charAt(0)=='A'|| texto.charAt(0)=='a') return true;
       return false;
   }   
   public static int contaA(String texto){
       int cont =0;
       for(int i=0; i<texto.length();i++){
           if(texto.charAt(i)=='A' || texto.charAt(i)=='a') cont++;
       }
       return cont;
   }    
   public static void leituraReais()throws FileNotFoundException {
       File origem = new File("reais.txt");
       Scanner arquivo = new Scanner(origem);
       //item 1 do Exercicio 2
       double maior = Double.MIN_VALUE;
       double valor;
       while(arquivo.hasNextLine()){
           String linha = arquivo.nextLine();
           System.out.println(linha);
           valor = Double.parseDouble(linha);
           if(valor>maior) maior = valor;
       }
       System.out.println("Maior = " + maior);
       arquivo.close();
   }
}



