public class e2ExtendedV3{
    public static void main(String args[]){
        System.out.println("\f");
        int num=1;
        System.out.println(somatoria(num));
    }
    public static String somatoria(int num){
        int x, soma1=0, soma2=0;
        int cont=0, contMax=0, numMax=0;
        String somatoria="--- ";
        String somatoriaMax= "--- ";
        String contMAX="";
        String numMAX="";
        String somatoriaMAX="";
        for(num=1; num<=50; num++){
            for(x=1;x<=num;x++){
                for(soma1=x; soma2<=num; soma1++){  
                    soma2=soma2+soma1;
                        if(soma2==num){
                        soma2=0;
                            for(soma1=x; soma2<num; soma1++){
                                soma2=soma2+soma1;
                                somatoria = somatoria + "-" + soma1;
                        }
                        somatoria = somatoria + " --- "; 
                        cont++;
                    }
                }
                soma2=0;
            }
            if(contMax==cont){
                contMax=cont;
                contMAX=contMAX+" "+contMax;
                numMax=num;
                numMAX=numMAX+" "+numMax;
                somatoriaMax = somatoria;
                somatoriaMAX=somatoriaMAX+" "+somatoriaMax;
            }
            if(contMax<cont){
                contMax=cont; numMax=num; somatoriaMax = somatoria;
                contMAX=contMax;
                numMAX=numMax;
                somatoriaMAX=somatoriaMax;
            }
            
            cont=0;
            somatoria= "--- ";
        }
        
        somatoriaMax = "O maior número de somatórias possíveis são: " + contMAX + ", do número " + numMAX 
        + ". As somatórias dele são: " + somatoriaMAX;
        return somatoriaMax;
    }
}