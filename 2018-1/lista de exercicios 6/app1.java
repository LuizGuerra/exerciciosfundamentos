public class app1{
    double raio;
    public app1(double raio){
        this.raio = raio;
    }
    public double volume(){
        return Math.PI*Math.pow(raio,3)*4/3;
    }
    public double area(){
        return Math.PI*Math.pow(raio,2)*4;
    }
}