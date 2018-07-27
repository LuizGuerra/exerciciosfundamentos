import java.util.Scanner;
public class dapa17{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("\fDiga seu primeiro nome: ");
        String primeironome = in.next();
        
        System.out.print("Diga seu último nome: ");
        String ultimosobrenome = in.next();
        
        System.out.print("Diga sua idade: ");
        int idade = in.nextInt();
        
        System.out.println("Olá "+primeironome+" "+ultimosobrenome+" de "+idade+" anos.");
    }
}