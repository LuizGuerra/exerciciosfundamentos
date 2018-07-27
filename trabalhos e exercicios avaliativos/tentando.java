import java.util.Scanner;
public class tentando{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\fInforme o número total de elementos no primeiro conjunto:");
        System.out.println();
        int eleT1 = in.nextInt();
        while(eleT1<0){
            System.out.println("Valor impossível, tente novamente.");
            eleT1 = in.nextInt();
        }
        int ele1 [] = new int [eleT1];
        System.out.println("Informe os elementos, um por um:");
        for(int x=0; x<eleT1; x++){
            System.out.print("Elemento nº "+(x+1)+": ");
            ele1 [x] = in.nextInt();
        }
        System.out.println();
        System.out.print("Informe o número total de elementos no segundo conjunto:");
        System.out.println();
        int eleT2 = in.nextInt();
        while(eleT2<0){
            System.out.println("Valor impossível, tente novamente.");
            eleT2 = in.nextInt();
        }
        int ele2 [] = new int [eleT2];
        System.out.println("Informe os elementos, um por um:");
        for(int x=0; x<eleT2; x++){
            System.out.print("Elemento nº "+(x+1)+": ");
            ele2 [x] = in.nextInt();
        }
        
        tpoo e1 = new tpoo(eleT1, ele1, eleT2, ele2);
        int batata1[]=e1.uniao();
        System.out.println("União dos conjuntos: ");
        for(int x=0; x<e1.getc1(); x++){
            System.out.print(batata1[x]+", ");
        }
        System.out.println("Intersecção dos conjuntos: ");
        int batata2[]=e1.intersec();
        for(int x=0; x<e1.getc2(); x++){
            System.out.print(batata2[x]+", ");
        }
    }
}