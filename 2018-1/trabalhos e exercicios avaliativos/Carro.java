public class Carro{
    String placa;
    double capacidadeTanque, mediaDeConsumo;
    double litros = 0;
    public Carro(String pla, double capacidade, double media){
        this.placa=pla;
        this.capacidadeTanque=capacidade;
        this.mediaDeConsumo=media;
    }
    public String getPlaca(){
        return placa;
    }
    public double getLitros(){
        return litros;
    }
    public double getMediaDeConsumo(){
        return mediaDeConsumo;
    }
    public void abastecer(double x){
        litros = litros+x;
    }
    public void setConsumo(double x){
        this.mediaDeConsumo=x;
    }
    public double preverCombustivel(double x){
        double usodegas=x/mediaDeConsumo;
        return usodegas/litros;
    }
}