public class ex3{
    public static int recursivo(String frase, int x){
        int y = 0;
        String str;
        if(x==0){
            str = frase.substring(0,1);
            if(str.equals(" ")){y++;}
            return y;
        }
        str = frase.substring(x,x+1);
        if(str.equals(" ")){y++;}
        y=y+recursivo(frase, x-1);
        return y;
    }
}