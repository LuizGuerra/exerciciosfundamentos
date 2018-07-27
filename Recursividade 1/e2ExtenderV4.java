public class e2ExtenderV4{
    public static void main(String args[]){
        System.out.print("\f");
        int num=1;
        System.out.print(somatoriaMax);

        int x, soma1=0, soma2=0;
        int cont=0, contMax=0, numMax=0;
        String somatoria="--- ";
        String somatoriaMax= "--- ";
        for(num=1; num<=500000; num++){
            for(x=1;x<=num;x++){
                for(soma1=x; soma2<=num; soma1++){  
                    soma2=soma2+soma1;
                        if(soma2==num){
                        soma2=0;
                            for(soma1=x; soma2<num; soma1++){
                                soma2=soma2+soma1;
                                somatoria = somatoria + "-" + soma1;
                        }
                        somatoria = somatoria + " --- \n"; 
                        cont++;
                        
                    }
                }
                soma2=0;
            }
            if(contMax<cont){contMax=cont; numMax=num; somatoriaMax = somatoria;}
            cont=0;
            somatoria= "--- ";
            System.out.println(num*100/500000="%");
        }
        somatoriaMax = "O maior número de somatórias possíveis são: " + contMax + ", do número " + numMax 
        + ".\n As somatórias dele são: \n" + somatoriaMax;
    }
}