import java.util.Scanner;
public class e5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme o nome do aluno: ");
        String nome = in.nextLine();
        System.out.print("Informe a matrícula do aluno: ");
        int matri = in.nextInt();
        System.out.print("Informe a frequência do aluno (em %): ");
        double fre = in.nextInt();
        if(fre<75){
            System.out.println("Aluno reprovado por frequência");
        }
        else{
            double nota[] = new double[6];
            for(int x = 0; x<6; x++){
                if(x<3){
                    System.out.print("Informe a "+(x+1)+"ª nota do aluno: ");
                    nota[x]=in.nextDouble();
                }
                else if(x==3){
                    System.out.print("Informe a média dos exercícios: ");
                    nota[x]=in.nextDouble();
                }
                else{
                    System.out.print("Informe a G"+(x-3)+": ");
                    nota[x]=in.nextDouble();
                }
            }
            app5 e1 = new app5(nome, matri, fre, nota);
            System.out.println("O aluno foi "+e1.apro());
        }
    }
}