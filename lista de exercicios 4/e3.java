import java.util.Scanner;
public class e3{
    public static void main(String cajézinho[]){
        Scanner in = new Scanner(System.in); 
        System.out.println("\fInforme a largura da casa: ");
        double largm = in.nextDouble();
        System.out.println("Informe o perímetro da casa: ");
        double perimm = in.nextDouble(); 
        
        System.out.println("Informe a largura do terreno: ");
        double largM = in.nextDouble();
        while (largm>largM){
            System.out.println("Valor impossível! Informe a largura do terreno: ");
            largM = in.nextDouble();
        }
        
        System.out.println("Informe o perímetro do terreno: ");
        double perimM = in.nextDouble();
        while(perimm>perimM){
            System.out.println("Valor impossível! Informe o perímetro do terreno: ");
            perimM = in.nextDouble();
        }
        
        System.out.println("A área da casa é: " + areadacasa(largm, perimm));
        System.out.println("A área do terreno é: " + areadoperimetro(largM, perimM));
        System.out.println("A área livre é: " + arealivre(areadacasa(largm,perimm), areadoperimetro(largM,perimM)));
    }
    public static double areadacasa(double largm, double perimm){
        double a = largm*perimm; 
        return a;
    }
    public static double areadoperimetro(double largM, double perimM){
        double b = largM*perimM;
        return b;
    }
    public static double arealivre(double areadacasa, double areadoperimetro){
        double c = areadoperimetro-areadacasa;
        return c;
    }
}

