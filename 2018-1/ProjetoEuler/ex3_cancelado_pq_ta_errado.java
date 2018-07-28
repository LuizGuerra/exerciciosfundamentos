public class ex3_cancelado_pq_ta_errado{
    public static void main (String args[]){
        System.out.print("\f");
        int primo = 0;
        System.out.println(primefactor(primo));
        
    }
    public static int primefactor(int primo){
        int cont=0;
        int batata=666;
        for(int x = 10000000; ; x--){
            for(int y = 1; y<=x; y++){
                if(x%y==0){
                    cont++;
                }
                if(cont==3){
                    cont=0;
                    break;
                }
                if(y==x && cont==2){
                    batata=x;
                    break;
                }
            }
            if(batata==x){break;}
        }
        return batata;
    }
}