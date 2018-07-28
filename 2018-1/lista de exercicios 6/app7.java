public class app7{
    String placa, modelo, cor;
    double km, capacidadeTanque;
    double quantidadeNoTanque;
    double totalDeGas;
    public app7(String placa, String modelo, String cor, double km, double capacidadeTanque, double quantidadeNoTanque){
        this.placa=placa;
        this.modelo=modelo;
        this.cor=cor;
        this.km=km;
        this.capacidadeTanque=capacidadeTanque;
        this.quantidadeNoTanque=quantidadeNoTanque;
    }
    public String abastecer(double x){
        if((quantidadeNoTanque+x)>capacidadeTanque){
            double soma = quantidadeNoTanque+x-capacidadeTanque;
            setTanque();
            return "Quantidade abastecida maior que a capacidade do tanque. Sobrou "+soma+" litros e o tanque está cheio."; 
        }
        quantidadeNoTanque=quantidadeNoTanque+x;
        return "O tanque agora tem "+quantidadeNoTanque+" litros.";
    }
    private void setTanque(){
        quantidadeNoTanque=capacidadeTanque;
    }
    public String andar(double x){
        setTotalDeGas();
        if(totalDeGas>x){
            double b=quantidadeNoTanque;
            quantidadeNoTanque=quantidadeNoTanque-(x/5);
            return "Você andou "+x+" km. Você gastou "+(b-quantidadeNoTanque)+" litros. O tanque agora tem "+quantidadeNoTanque+" litros.";
        }
        setTotalDeGas();
        return "Você não tem gasolina suficiente. Você andou "+totalDeGas+" km e ficou sem gasolina.";
    }
    public void setTotalDeGas(){
        totalDeGas=5*quantidadeNoTanque;
    }
}