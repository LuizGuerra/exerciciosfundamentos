import java.util.Scanner;
public class p2q3{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("\f");
        int n=1,m=0,o=0,idadeS=0,idademaior=0,semestremaior=0;
        while(n<=5){
            System.out.println("Informe a idade do "+n+ "º estudante: ");
            int idade = in.nextInt();
            
            System.out.println("Informe o semestre do "+n+"º estudante: ");
            int semestre=in.nextInt();
            
            if(idade>=20&&idade<=23)m++;
            if(semestre==1){
                idadeS=idadeS+idade;
                o++;
            }
            if(idade>idademaior){
                idademaior=idade;
                semestremaior=semestre;
            }
            n++;
        }
        System.out.println("A quantidade de alunos entre 20 e 23 anos é/são "+m+" alunos.");
        System.out.println("A média de idade dos alunos no primeiro semestre é "+(idadeS/o));
        System.out.println("O semestre do aluno mais velho é " +semestremaior);
    }
}