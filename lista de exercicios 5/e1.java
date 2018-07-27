import java.util.Scanner;
public class e1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme 10 valores inteiros: ");
        int a [] = new int [10];
        for(int x=0; x<10; x++){
            System.out.print((x+1)+"º valor: ");
            a[x]=in.nextInt();
        }
        System.out.println();
        System.out.println("Os valores ímpares do conjunto são: ");
        for(int x=0; x<10; x++){
            int cont=0;
            if(a[x]%2==1){
                if(cont==0){
                    System.out.print(a[x]);
                }
                else{
                    System.out.print(", "+a[x]);
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Os valores das posições ímpares são: ");
        for(int x=0; x<10; x=x+2){
            System.out.println("Posição "+(x+1)+", valor "+a[x]);
        }
        System.out.println();
        System.out.println("Os valores ímpares nas posições pares são: ");
        for(int x=1; x<10; x=x+2){
            if(a[x]%2==1){
                System.out.println("Posição "+(x+1)+", valor "+a[x]);
            }
        }
        int y = 1;
        System.out.println();
        System.out.println("O vetor na ordem inversa: ");
        for(int x=9; x>=0; x--){
            System.out.println(y+"ª posição: "+a[x]);
        }
    }
}