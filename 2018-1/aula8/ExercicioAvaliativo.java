import java.util.Scanner;
public class ExercicioAvaliativo{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println(" === Programa para calcular o Colesterol LDL === \n");
        System.out.println("- Por favor, informe seu Colesterol Total:");
        double colesterolTotal = entrada.nextDouble();
        System.out.println("\n- Agora, informe seu Colesterol HDL:");
        double colesterolHdl = entrada.nextDouble();
        System.out.println("\n- Por fim, informe seu trigliceridio: ");
        double trigliceridio = entrada.nextDouble();
        if(colesterolTotal < 0 || colesterolHdl < 0  || trigliceridio < 0)
             System.out.println("\nERRO! Os seus dados devem ser positivos!");           
        else{
            double colesterolLdl = colesterolTotal - colesterolHdl - (trigliceridio / 5);
            System.out.println("\nSeu colesterol LDL é de atualmente: "+colesterolLdl+"mgs");    
            if(colesterolLdl >= 50 && colesterolLdl <= 190)
                System.out.println("O seu colesterol LDL está normal!");
            else
                System.out.println("O seu colesterol está desregulado!");}}}