import java.util.Scanner;
public class that{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Diga um número natural: ");
        int num = in.nextInt();
        
        int y=1, z=1, w=0;
        
        
    }
    public static int tubarao(int num, int y, int z, int w){
        for(y=1; y<=num; y++){
            z++;
            while(w<=num){
                System.out.print(" "+z);
                z++;
                w=+z;
            }
        }
        if (w==num) return num;
        return num;
    }
}