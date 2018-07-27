import java.util.Scanner;
public class ex16{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Diga seu salário");
        double salario = in.nextDouble();
        if (salario<0){System.out.println("Salário impossível. Tente novamente");}
        else{
            System.out.println("Aliquota para o INSS é de " + aliquota(salario) +  " reais.");
        }
        System.out.println("");
    }
    public static double aliquota(double salario){
        if (salario<(1317.07)) {return salario*8/100;}
        else if (salario<(2195.12)) {return salario*9/100;}
        return salario*11/100;
    }
}