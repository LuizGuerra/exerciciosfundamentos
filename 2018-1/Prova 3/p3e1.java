public class p3e1{
    int ano;
    public p3e1(int ano){
        this.ano=ano;
    }
    public double valor(double area){
        if(ano<2000){
            return area*1188;
        }
        else if(ano<=2008){
            return area*1750;
        }
        return area*2000;
    }
}