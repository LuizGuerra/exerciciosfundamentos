import java.util.Scanner;
public class Exercicio22
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("\fInforme um valor inteiro (R$) entre 1 e 9999: ");
        int valor = in.nextInt();
        if(valor<1 || valor>9999) System.out.println("ERRO: O valor deve estar em [1;9999]");
        else{
            if(valor>999){
                int milhar = valor/1000;
                int resto = valor % 1000;
                switch(milhar){
                    case 1: System.out.print("mil "); break;
                    case 2: System.out.print("dois mil "); break;
                    case 3: System.out.print("três mil "); break;
                    case 4: System.out.print("quatro mil "); break;
                    case 5: System.out.print("cinco mil "); break;
                    case 6: System.out.print("seis mil "); break;
                    case 7: System.out.print("sete mil "); break;
                    case 8: System.out.print("oito mil "); break;
                    case 9: System.out.print("nove mil "); break;
                }
                int centena = resto/100;
                resto = resto %100;
                switch(centena){
                    case 1: System.out.print("e cem "); break;
                    case 2: System.out.print("e duzentos "); break;
                    case 3: System.out.print("e trezentos "); break;
                    case 4: System.out.print("e quatrocentos "); break;
                    case 5: System.out.print("e quinhentos "); break;
                    case 6: System.out.print("e seiscentos "); break;
                    case 7: System.out.print("e setecentos"); break;
                    case 8: System.out.print("e oitocentos "); break;
                    case 9: System.out.print("e novecentos"); break;
                }
                int dezena = resto/10;
                int unidade = resto %10;
                switch(dezena){
                    case 1:{
                        switch(unidade){
                        case 1: System.out.print("e onze "); break;
                        case 2: System.out.print("e doze "); break;
                        case 3: System.out.print("e treze "); break;
                        case 4: System.out.print("e quatorze "); break;
                        case 5: System.out.print("e quinze "); break;
                        case 6: System.out.print("e dezesseis "); break;
                        case 7: System.out.print("e dezessete "); break;
                        case 8: System.out.print("e dezoito "); break;
                        case 9: System.out.print("e dezenove "); break;
                    }}
                    case 2: System.out.print("e vinte "); break;
                    case 3: System.out.print("e trinta "); break;
                    case 4: System.out.print("e quarenta "); break;
                    case 5: System.out.print("e cinquenta "); break;
                    case 6: System.out.print("e sessenta "); break;
                    case 7: System.out.print("e setenta "); break;
                    case 8: System.out.print("e oitenta "); break;
                    case 9: System.out.print("e noventa "); break;
                }
                switch(unidade){
                    case 1: System.out.print("e um "); break;
                    case 2: System.out.print("e dois "); break;
                    case 3: System.out.print("e três "); break;
                    case 4: System.out.print("e quatro "); break;
                    case 5: System.out.print("e cinco "); break;
                    case 6: System.out.print("e seis "); break;
                    case 7: System.out.print("e sete "); break;
                    case 8: System.out.print("e oito "); break;
                    case 9: System.out.print("e nove "); break;}
            }
            else if(valor>99){
                int centena = valor/100;
                int resto = valor %100;
                switch(centena){
                    case 1: System.out.print("e cem "); break;
                    case 2: System.out.print("e duzentos "); break;
                    case 3: System.out.print("e trezentos "); break;
                    case 4: System.out.print("e quatrocentos "); break;
                    case 5: System.out.print("e quinhentos "); break;
                    case 6: System.out.print("e seiscentos "); break;
                    case 7: System.out.print("e setecentos"); break;
                    case 8: System.out.print("e oitocentos "); break;
                    case 9: System.out.print("e novecentos"); break;
                }
                int dezena = resto/10;
                int unidade = resto %10;
                switch(dezena){
                    case 1:{
                        switch(unidade){
                        case 1: System.out.print("e onze "); break;
                        case 2: System.out.print("e doze "); break;
                        case 3: System.out.print("e treze "); break;
                        case 4: System.out.print("e quatorze "); break;
                        case 5: System.out.print("e quinze "); break;
                        case 6: System.out.print("e dezesseis "); break;
                        case 7: System.out.print("e dezessete "); break;
                        case 8: System.out.print("e dezoito "); break;
                        case 9: System.out.print("e dezenove "); break;
                    }}
                    case 2: System.out.print("e vinte "); break;
                    case 3: System.out.print("e trinta "); break;
                    case 4: System.out.print("e quarenta "); break;
                    case 5: System.out.print("e cinquenta "); break;
                    case 6: System.out.print("e sessenta "); break;
                    case 7: System.out.print("e setenta "); break;
                    case 8: System.out.print("e oitenta "); break;
                    case 9: System.out.print("e noventa "); break;
                }
                switch(unidade){
                    case 1: System.out.print("e um "); break;
                    case 2: System.out.print("e dois "); break;
                    case 3: System.out.print("e três "); break;
                    case 4: System.out.print("e quatro "); break;
                    case 5: System.out.print("e cinco "); break;
                    case 6: System.out.print("e seis "); break;
                    case 7: System.out.print("e sete "); break;
                    case 8: System.out.print("e oito "); break;
                    case 9: System.out.print("e nove "); break;}}
            else if(valor>9){
                int unidade = valor/1000;
                int resto = valor % 1000;
                switch(unidade){
                        case 1: System.out.print("e onze "); break;
                        case 2: System.out.print("e doze "); break;
                        case 3: System.out.print("e treze "); break;
                        case 4: System.out.print("e quatorze "); break;
                        case 5: System.out.print("e quinze "); break;
                        case 6: System.out.print("e dezesseis "); break;
                        case 7: System.out.print("e dezessete "); break;
                        case 8: System.out.print("e dezoito "); break;
                        case 9: System.out.print("e dezenove "); break;
                    }}
                        case 2: System.out.print("e vinte "); break;
                        case 3: System.out.print("e trinta "); break;
                        case 4: System.out.print("e quarenta "); break;
                        case 5: System.out.print("e cinquenta "); break;
                        case 6: System.out.print("e sessenta "); break;
                        case 7: System.out.print("e setenta "); break;
                        case 8: System.out.print("e oitenta "); break;
                        case 9: System.out.print("e noventa "); break;
                }
                switch(unidade){
                    case 1: System.out.print("e um "); break;
                    case 2: System.out.print("e dois "); break;
                    case 3: System.out.print("e três "); break;
                    case 4: System.out.print("e quatro "); break;
                    case 5: System.out.print("e cinco "); break;
                    case 6: System.out.print("e seis "); break;
                    case 7: System.out.print("e sete "); break;
                    case 8: System.out.print("e oito "); break;
                    case 9: System.out.print("e nove "); break;}}
            
            }
        }
    }
}