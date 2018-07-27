import java.util.Scanner;
public class E3Adriano_Matheus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe as letras da placa do veículo: ");
        String letras = in.nextLine();
        System.out.println("Informe os números da placa do veículo: ");
        int numeros = in.nextInt();
        verificaPlaca(letras,numeros);
    }
    public static void verificaPlaca (String letras, int numeros){
        int tamLetras = letras.length(); 
        if(tamLetras<3 || tamLetras>3){System.out.println("Placa Inválida.");}
        else{System.out.println("OK.");}
        int tamanhoNumeros = numeros/1000;
        if(String.valueOf(numeros)=="0000"){System.out.println("Placa inválida.");}
        else if(tamanhoNumeros<1 || tamanhoNumeros>10){System.out.println("Placa inválida.");}                     
    }
}
