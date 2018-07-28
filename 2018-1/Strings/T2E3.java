import java.io.FileOutputStream;
import java.io.PrintWriter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.Scanner;

public class T2E3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        try{
            FileInputStream arquivo = new FileInputStream("arquivo.txt"); // arquivo.txt
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            
            FileOutputStream arquivo_ao_contrario = new FileOutputStream("backward.txt");
            PrintWriter pr = new PrintWriter(arquivo_ao_contrario);
            
            String linha;
            
            do{
                linha = br.readLine();
                if(linha != null){
                    String [] palavras = linha.split(" ");
                    String nomeI = "";
                    String completa = "";
                    for(int i = 0; i<palavras.length; i++){
                        int mds = palavras[i].length();
                        nomeI = "";
                        completa = "";
                        
                        nomeI = backword(nomeI, palavras[i], i, mds);
                        //for(int x=mds-1; x>=0; x--){
                        //    nomeI = nomeI + palavras[i].charAt(x);
                        //    backword(nomeI, palavras[i], i, x, mds);
                        //}
                        pr.print(nomeI+" ");
                    }
                }
                pr.println();
            }while(linha != null);
            pr.close();
            arquivo.close();
            System.out.println("Sucesso! O arquivo possui o nome 'backward' e está na pasta deste projeto blueJ.");
        }
        catch(Exception erro){
            System.out.println("Erro");
        }
    }
    public static String backword(String nomeI, String palavras, int i, int mds){
        for(int x=mds-1; x>=0; x--){
            nomeI = nomeI + palavras.charAt(x);
            
        }
        return nomeI;
    }
}