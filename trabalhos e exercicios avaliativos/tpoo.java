public class tpoo{
    int eleT1;
    int [] ele1;
    int eleT2;
    int [] ele2;
    int cont1=0, cont2=0;
    public tpoo(int eleT1, int [] ele1, int eleT2, int [] ele2){
        this.eleT1 = eleT1;
        this.ele1 = ele1;
        this.eleT2 = eleT2;
        this.ele2 = ele2;
    }
    public int getc2(){
        contadorInt();
        return cont1;
    }
    public int getc1(){
        contadorUni();
        return cont2;
    }
    public int [] uniao(){
        contadorInt();
        int cont=0;
        int batata[]=new int [cont1];
        for(int n=0; n<cont1; n++){
            for(int m=n;;m++){
                if(ele1[n]==ele2[m]){
                    batata[cont]=ele1[n];
                    cont++;
                }
                if(ele1[n]!=ele2[m]){
                    batata[cont]=ele1[n];
                    cont++;
                    batata[cont]=ele2[m];
                    cont++;
                }
            }
        }
        return ele1;
    }
    public int [] intersec(){
        contadorInt();
        int cont=0;
        int batata[]=new int [cont1];
        for(int n=0; n<cont1; n++){
            for(int m=n;;m++){
                if(ele1[n]==ele2[m]){
                    batata[cont]=ele1[n];
                    cont++;
                }
            }
        }
        return batata;
    }
    public void contadorInt(){
        for(int n=0; n<eleT1+eleT2; n++){
            for(int m=n;;m++){
                if(ele1[n]==ele2[m]){
                    cont1++;
                }
            }
        }
    }
    public void contadorUni(){
        int cont=0;
        for(int n=0; n<cont1; n++){
            for(int m=n;;m++){
                if(ele1[n]==ele2[m]){
                    cont++;
                }
                if(ele1[n]!=ele2[m]){
                    cont++;
                    cont++;
                }
            }
        }
    }
}