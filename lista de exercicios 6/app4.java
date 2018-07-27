public class app4{
    double altB, corB, altC, corC, altT;
    public app4(double altB, double corB, double altC, double corC, double altT){
        this.altB=altB;
        this.corB=corB;
        this.altC=altC;
        this.corC=corC;
        this.altT=altT;
    }
    public double volume(){
        double volumeB = Math.PI*Math.pow(corB,2)*altB;
        double volumeC = Math.PI*Math.pow(corC,2)*altC;
        double volCone = Math.PI*(Math.pow(corB,2)+corB+Math.pow(corC,2)+corC)*(altT-altB-altC)/3;
        return (volumeB+volumeC+volCone);
    }
}