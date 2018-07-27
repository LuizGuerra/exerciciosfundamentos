import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int vet [] = new int[3];
        int x;
        for(x=0; x<3; x++){
            vet [x] = in.nextInt();
        }
        for(x=0; x<3; x++){
            System.out.println(metodo(vet)[x]);
        }
    }
    public static int [] metodo(int [] vet){
        int [] batata = new int [3];
        for(int x=0; x<3; x++){
            batata [x] = vet [x] * 2;
        }
        return batata;
    }
}