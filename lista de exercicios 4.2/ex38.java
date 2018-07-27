/** Construa um programa que leia uma string e verifique se ela pode ser a
 * placa de um carro. Para isso, ela deve ser 7 caracteres, sendo que os 3
 * primeiros devem ser letras e os 4 últimos, digitos. A vericação deve ser
 * feita por um método */
import java.util.Scanner;
public class ex38{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDiga uma placa de um veículo: ");
        String frase = in.nextLine();
        System.out.println("A string dada "+placa(frase));
    }
    public static String placa (String frase){
        int cont = 0;
        if(frase.length()==7){
            for(int x=0;x<3;x++){
                if(Character.isLetter(frase.charAt(x))){
                    cont++;
                    if(cont==3){
                        cont=0;
                        for(x=3;x<7;x++){
                            if(Character.isDigit(frase.charAt(x))){
                                cont++;
                                if(cont==4){return "é uma placa de um veículo.";}
                            }
                        }
                    }
                }
            }
        }
        return "não é uma placa de um veículo.";
    }
}