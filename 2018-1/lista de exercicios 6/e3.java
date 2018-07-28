import java.util.Scanner;
public class e3{
    public static void main(String args[]){
        System.out.print("\f");
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("A sinaleira está vermelha. Digite 1 para solicitar a troca do estado, qualquer coisa para finalizar:");
        x = in.nextInt();
        if(x==1){
            app3 e1 = new app3();
            String s = e1.area();
            System.out.println(s);
                while(x==1){
                System.out.println();
                System.out.print("Digite 1 para solicitar a troca do estado, qualquer coisa para finalizar:");
                x = in.nextInt();
                System.out.println();
                System.out.println(e1.area());
            }
        }
    }   
}