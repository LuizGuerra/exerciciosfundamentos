public class app14{
    double casaL, casaC, terrenoL, terrenoC;
    public app14(double casaL, double casaC, double terrenoL, double terrenoC){
        this.casaL=casaL;
        this.casaC=casaC;
        this.terrenoL=terrenoL;
        this.terrenoC=terrenoC;
    }
    public double areaT(){
        return terrenoL*terrenoC;
    }
    public double arealivre(){
        return (areaT()-(casaL*casaC));
    }
}