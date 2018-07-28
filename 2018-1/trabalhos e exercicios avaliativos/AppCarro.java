import java.util.Scanner;
public class AppCarro{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\f");
        String placa = "abc1234";
        double capacidadeTanque = 50;
        double mediaDeConsumo = 8;
        Carro carro1 = new Carro(placa,capacidadeTanque,mediaDeConsumo);
        carro1.abastecer(30.5);
        carro1.abastecer(14.5);
        System.out.println("O carro com a placa " + carro1.getPlaca() + " tem em seu tanque " + carro1.getLitros() + " litros.");
        mediaDeConsumo = mediaDeConsumo + 3;
        carro1.setConsumo(mediaDeConsumo);
        int distancia = 750;
        System.out.println("O carro " + carro1.getPlaca() + " para percorrer " + distancia + " km precisará de " +
        carro1.preverCombustivel(distancia) + " tanque(s) de combustivel");
        
        
        
        System.out.println("Informe a placa do veículo: ");
        placa = in.next();
        do{
            System.out.print("Informe a cacapacidade do tanque (mínimo de 40 litros): ");
            capacidadeTanque = in.nextDouble();
        }while(capacidadeTanque<40);
        do{
            System.out.print("Informe a media do consumo do veículo: ");
            capacidadeTanque = in.nextDouble();
        }while(mediaDeConsumo<1);
        Carro carro2 = new Carro(placa,capacidadeTanque,mediaDeConsumo);
        System.out.print("Informe o quanto deseja abastecer: ");
        double gas = in.nextDouble();
        carro2.abastecer(gas);
        
        System.out.println("O carro com a placa " + carro2.getPlaca() + " tem em seu tanque " + carro2.getLitros() + " litros.");
        mediaDeConsumo = mediaDeConsumo + 3;
        carro2.setConsumo(mediaDeConsumo);
        System.out.print("Informe a distância total que deseja correr: ");
        distancia = in.nextInt();
        System.out.println("O carro " + carro2.getPlaca() + " para percorrer " + distancia + " km precisará de " +
        carro2.preverCombustivel(distancia) + " tanque(s) de combustivel");
    }
}