import java.util.Scanner;
public class p3q3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int idade, escolaridade, entrevistado=0, cont=0, idadeM=0,escolaridadeM=0;
        double renda, rendaT=0,rendaA=0;
        System.out.print("\f");
        while (entrevistado<=100){
            System.out.println("Informe a idade do habitante nº "+entrevistado+": ");
            idade = input.nextInt();
            
            System.out.println("Informe a renda em reais do habitante nº "+entrevistado+": ");
            renda = input.nextDouble();
            
            System.out.println("Use 1 para Ensino Fundamental completo, 2 para Médio completo e 3 para Superior completo;");
            System.out.println("Informe a escolaridade do habitante nº "+entrevistado+": ");
            escolaridade=input.nextInt();
            
            rendaT=rendaT+renda;
            if(escolaridade==3)cont++;
            if (idade>idadeM){
                idadeM=idade;
                escolaridadeM=escolaridade;
                rendaA=renda;
            }
            entrevistado++;
        }
        double nivelS = cont*100/entrevistado;
        double rendaM = rendaT/entrevistado;
        System.out.println("Porcentual de habitantes com nível superior: " +nivelS+"%");
        System.out.println("Média de renda da população: "+rendaM);
        System.out.println("A escolaridade e renda do habitante mais velho são "+escolaridadeM+" e "+rendaA+", respectivamente.");
    }
}