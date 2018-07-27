public class app2{
    double alt, base;
    public app2(double alt, double base){
        this.alt = alt;
        this.base = base;
    }
    public double area(){
        return alt*base;
    }
    public double per(){
        return 2*alt+2*base;
    }
}