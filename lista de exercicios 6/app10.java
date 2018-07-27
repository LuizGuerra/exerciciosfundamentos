public class app10{
    int hora, min, seg;
    int dia=0;
    public app10(int hor, int mi, int se){
        if(se<60){
           this.seg=se;
        }
        else{
            min = se/60;
            int x = se%60;
            se=x;
            this.seg=se+x;
        }
        if(mi<60){
           this.min=mi; 
        }
        else{
            hora = mi/60;
            int x = mi%60;
            mi=x;
            this.min=min+x;
        }
        if(hor<24){
           this.hora=hor; 
        }
        else{
            dia = hor/24;
            int x = hor%24;
            hor=x;
            this.hora=hora+x;
        }
    }
    public int getDia(){
        return dia;
    }
    public int getHora(){
        return hora;
    }
    public int getMin(){
        return min;
    }
    public int getSeg(){
        return seg;
    }
    public int seg(){
        int x = ((hora*3600)+(min*60)+seg);
        return x;
    }
    public String min(){
        String x = ((hora*60)+min)+" minutos e " +seg+" segundos";
        return x;
    }
    public int falta(){
        int x = ((24*60*60)-seg());
        return x;
    }
    public void puclic(int h, int m, int s){
        int horus = hora+h;
        int minus = min+m;
        int segus = seg+s;
        if(segus<60){
           this.seg=segus;
        }
        else{
            minus = minus + segus/60;
            int x = segus%60;
            minus = x;
            this.seg=segus;
        }
        if(minus<60){
           this.min=minus; 
        }
        else{
            hora = horus + minus/60;
            int x = minus%60;
            minus = x;
            this.min=minus;
        }
        if(horus<24){
           this.hora=horus; 
        }
        else{
            dia = dia + horus/24;
            int x = horus%24;
            horus=x;
            this.hora=horus;
        }
    }
}