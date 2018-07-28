import java.util.Scanner;
public class ex13{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme seu salário: ");
        double salario = in.nextDouble();
        if(salario<0){System.out.println("Valor impossível. Tente novamente.");}
        else{
            System.out.println("Informe o número do seu cargo.");
            int cargo = in.nextInt();
            if(cargo<101 || cargo>104){System.out.println("Salário antigo: "+salario+" reais. Novo salário: "+
                novoS(salario, cargo)+" reais. Diferença entre salários de: "+diferença(salario, cargo)+" reais.");}
            else{
                System.out.println("Salário antigo: "+salario+" reais. Novo salário: "+
                novoS(salario, cargo)+" reais. Diferença entre salários de: "+diferença(salario, cargo));}
            }
        }
    public static double novoS(double salario, int cargo){
        if(cargo>100 || cargo<105){
            switch (cargo){
                case 101: return ((salario*6/100)+salario);
                case 102: return ((salario*7/100)+salario);
                case 103: return ((salario*8/100)+salario);
                case 104: return ((salario*9.5/100)+salario);
            }
        }
        return salario*5/100;
    }
    public static double diferença(double salario, int cargo){
        if(cargo>100 || cargo<105){
            switch (cargo){
                case 101: return (salario*6/100);
                case 102: return (salario*7/100);
                case 103: return (salario*8/100);
                case 104: return (salario*9.5/100);
            }
        }
        return salario*5/100;
    }
}