import java.util.Scanner;
public class p2q1 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um valor inteiro e positivo: ");
        int valor = entrada.nextInt();
        int num = 1;
        int resultado = 0;
        int limite = valor/2;
        while(num <= limite){
            if(valor % num == 0) resultado = resultado + num;
            num++;
        }
        if(resultado==valor) {System.out.println("Tem a propriedade.");}
            else {System.out.println("O valor não possui a propriedade");}
}
}