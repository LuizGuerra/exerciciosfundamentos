import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Operacao{
    public static double calcular (String args[]){
        if(y<=0) return 1;
        return x * calcular (x,y-1);
    }
    public static void gravar(String nomeArquivo) throws FileNotFoundException{
        PrintWriter arquivo = new PrintWriter(nomeArquivo);
        for(int b=2; b<6; b++){
            for(int e=0; e<4; e++){
                arquivo.println("b:"+b+" e:"+e+" Resultado: "+calcular(b,e));
            }
        }
        arquivo.close();
    }
}