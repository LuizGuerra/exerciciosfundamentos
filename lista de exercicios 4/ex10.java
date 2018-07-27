import java.util.Scanner;
public class ex10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme seu sexo: 1 para masculino, 2 para feminino, 3 para andrógeno e 4 para hermafrodita");
        int sexo=in.nextInt();
        double altura;
        if(sexo==4){System.out.println("Ah... Não tenho dados para esse sexo. desculpa.");}
        else if(sexo==3){System.out.println("Ah... Não tenho dados para esse sexo. desculpa.");}
        else if(sexo==2){
            System.out.println("Informe sua altura em centímetros: ");
            altura = in.nextDouble();
            if(altura<=0 && altura>=3){System.out.println("Altura incorreta. Tente novamente.");}
            else{System.out.println("Seu peso ideal é "+pesoF(altura));}
        }
        else if(sexo==1){
            System.out.println("Informe sua altura em centímetros: ");
            altura = in.nextDouble();
            if(altura<=0 && altura>=3){System.out.println("Altura incorreta. Tente novamente.");}
            else{System.out.println("Seu peso ideal é "+pesoM(altura));}
        }
        else{System.out.println("Dado incorreto, tente novamente.");}
    }
    public static double pesoF(double altura){
        return ((62.1*altura)-44.7)/100;
    }
    public static double pesoM(double altura){
        return ((72.7*altura)-58)/100;
    }
}