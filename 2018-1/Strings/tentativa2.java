import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.io.FileReader;

import java.io.BufferedReader;
public class tentativa2{
    public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        //System.out.print("\fInforme local do arquivo a ser lido: \n");
        // String local = in.nextLine();
        String local = "E:/Dados/Área de Trabalho/eng_de_software.txt";
        // E:\Dados\Área de Trabalho\Desktop\eng_de_software.txt
        String linha = new String();
        String nomeArquivo = "";
        
        Path caminho = Paths.get(local);
        try{
        
            FileReader leitorDeArquivo = new FileReader(local);
            BufferedReader bufferDeArquivo = new BufferedReader (leitorDeArquivo);
            
            while(true){
                linha = bufferDeArquivo.readLine();
                if(linha==null){
                    break;
                }
                System.out.println(linha);
            }
            
            // System.out.println("");
            
        } catch(Exception erro){
            System.out.println("ERRO");
        } 
    }
}