import java.util.Scanner;
public class exerc3{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);System.out.println("\fDigite sua altura: ");double alt = input.nextDouble();
        if(alt<0.5 || alt>2.9) System.out.println("Altura incorreta, tente novamente.");
        else{System.out.println("Digite seu sexo, 0 para feminino e 1 para masculino: ");int sexo = input.nextInt();
        if(sexo == 0) System.out.println("Seu peso ideal é: " + (alt*62.1-44.7));
        else if(sexo == 1) System.out.println("Seu peso ideal é " + (alt*72.7-58));
        else System.out.println("Sexo incorreto. Por favor, tente novamente.");}}}