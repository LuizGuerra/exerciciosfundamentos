import java.util.Scanner;
public class p2q4{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int cont = 1, soma = 0, contSalario=0, contFilhos=0, idadeMelhor=0;
        double somaSalario = 0, maior = 0;
        while(cont<=200000){
            System.out.println("Informe a idade: ");
            int idade = entrada.nextInt();
            System.out.println("Informe o salário: ");
            double salario = entrada.nextDouble();
            System.out.println("Informe o número de filhos: ");
            int filhos = entrada.nextInt();
            cont++;
            soma = soma + idade;
            if(idade>=18 && idade<=40){
                somaSalario = somaSalario + salario;
                contSalario++;
            }
            if(filhos>2) contFilhos++;
            if(salario> maior){
                maior = salario;
                idadeMelhor = idade;
            }
        }
        System.out.println("Média de idade: "+(soma/200000));
        if(contSalario!=0){System.out.println("Média de salario [18;40]: "+(somaSalario/contSalario));}
        System.out.println("Percentual de pessoas com mais de 2 filhos: "+contFilhos*100/200000);
        System.out.println("Idade da pessoa com melhor salário: " + idadeMelhor);
    }
}