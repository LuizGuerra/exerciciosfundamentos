import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class tentativa1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a localização do arquivo de txt: ");
        String local = in.nextLine();
        
    }
    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null){System.out.println(linha);}
            else {break;}
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
}