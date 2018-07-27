import java.util.Scanner;
public class e14{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme a largura da casa: ");
        double casaL = in.nextDouble();
        while(casaL<=0){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            casaL = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe o comprimento da casa: ");
        double casaC = in.nextDouble();
        while(casaC<=0){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            casaC = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe a largura do terreno: ");
        double terrenoL = in.nextDouble();
        while(casaL>terrenoL){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            terrenoL = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe o comprimento do terreno: ");
        double terrenoC = in.nextDouble();
        while(casaC>terrenoC){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            terrenoC = in.nextDouble();
        }
        System.out.println();
        app14 e1 = new app14(casaL, casaC, terrenoL, terrenoC);
        
        System.out.println("A área total do terreno é  de "+e1.areaT()+" metros quadrados.");
        System.out.println("A área livre do terreno é de "+e1.arealivre()+" metros quadrados.");
        
        System.out.println();
        System.out.println("Informe valores para uma nova casa:");
        System.out.println();
        System.out.print("Informe a largura da casa: ");
        casaL = in.nextDouble();
        while(casaL<=0){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            casaL = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe o comprimento da casa: ");
        casaC = in.nextDouble();
        while(casaC<=0){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            casaC = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe a largura do terreno: ");
        terrenoL = in.nextDouble();
        while(casaL>terrenoL){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            terrenoL = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe o comprimento do terreno: ");
        terrenoC = in.nextDouble();
        while(casaC>terrenoC){
            System.out.println();
            System.out.print("Valor inválido. Informe outro, por favor: ");
            terrenoC = in.nextDouble();
        }
        System.out.println();
        app14 e2 = new app14(casaL, casaC, terrenoL, terrenoC);
        
        System.out.println("A diferença de área dos dois terrenos são de "+(e1.areaT()-e2.areaT())+" metros quadrados.");
    }
}