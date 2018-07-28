import java.util.Scanner;
public class Exercicio27
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int idade, genero, habitantes=0, maior=0, menor=100, contMul=0;
        double salario, somaSal=0;
        
        while(true){
            System.out.print("Informe a idade: ");
            idade = in.nextInt();
            if(idade<0 || idade>100) break;
            
            if(idade<menor) menor = idade;
            if(idade>maior) maior = idade;
            
            System.out.print("Informe o genero (1-masc/2-fem): ");
            genero = in.nextInt();
            while(genero!=1 && genero!=2){
                System.out.println("Genero inválido!");
                System.out.print("Informe novamente o genero (1-masc/2-fem): ");
                genero = in.nextInt();
            }
          
            System.out.print("Informe o salario: ");
            salario = in.nextDouble();
            while(salario<0){
                System.out.println("Salário inválido!");
                System.out.print("Informe novamente o salario: ");
                salario = in.nextDouble();
            }
            somaSal = somaSal + salario;
            habitantes++;
            if(genero==2 && salario<=3500) contMul++;
        }
        if(habitantes ==0) System.out.println("Dados não informados");
        else{
            System.out.println("Média de salário: " + somaSal/habitantes);
            System.out.println("Maior idade: " + maior);
            System.out.println("Menor idade: " + menor);
            System.out.println("Qtde de mulheres que ganham até R$3500: " + contMul);
        }
    }
}
