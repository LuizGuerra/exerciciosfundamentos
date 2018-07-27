import java.util.Scanner;
public class e7{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("\fDiga a placa do carro:");
        String placa = in.nextLine();
        while(placa(placa).equals("n")){
            System.out.println();
            System.out.println("Placa impossível. Diga a placa do carro:");
            placa = in.nextLine();
        }
        System.out.println();
        System.out.println("Informe o modelo do veículo: ");
        String modelo = in.nextLine();
        System.out.println();
        System.out.println("Informe a cor do veículo: ");
        String cor = in.nextLine();
        System.out.println();
        System.out.print("Informe a quilometragem do veículo: ");
        double km = in.nextDouble();
        while(km<0){
            System.out.println();
            System.out.println("Valor impossível. Informe a quilometragem do veículo: ");
            km = in.nextDouble();
        }
        System.out.println();
        System.out.print("Informe a capacidade do tanque do veículo: ");
        double capacidadeTanque = in.nextDouble();
        System.out.println();
        System.out.print("Informe a quantidade de gasolina no tanque do veículo: ");
        double quantidadeNoTanque = in.nextDouble();
        System.out.println();
        while(capacidadeTanque<quantidadeNoTanque){
            System.out.println("Quantidade no tanque impossível. Informe a quantidade menor que a capacidade do tanque:");
            quantidadeNoTanque = in.nextDouble();
        }
        
        app7 e1 = new app7(placa, modelo, cor, km, capacidadeTanque, quantidadeNoTanque);
        System.out.println();
        
        System.out.print("Digite sim se deseja encher o tanque de gasolina, não se já deseja dirigir o carro: ");
        String encher=in.next();
        while(encher.equals("sim")){
            System.out.print("Informe a quantidade que deseja abastecer: ");
            double x = in.nextDouble();
            System.out.println(e1.abastecer(x));
            System.out.println();
            System.out.print("Digite sim se deseja abastecer mais gasolina, não se já deseja dirigir: ");
            encher=in.next();
        }
        System.out.println();
        System.out.println("Atenção! O carro faz 5 quilômetros por litro.");
        System.out.print("Informe quantos quilômetros deseja andar com o carro: ");
        double andar = in.nextDouble();
        System.out.println(e1.andar(andar));
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
                                if(cont==4){return "";}
                            }
                        }
                    }
                }
            }
        }
        return "n";
    }
}