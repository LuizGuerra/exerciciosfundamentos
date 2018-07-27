public class app18{
    int [] nums;
    int qt;
    public app18(int [] num, int qt){
        this.nums=num;
        this.qt=qt;
    }
    public boolean [] caracteristica(){
        boolean [] batata = new boolean [qt];
        for(int x=0; x<qt; x++){
            int cont=nums[x];
            int m=cont/1000;
            cont = cont-(m*1000);
            int c=cont/100;
            cont = cont-(c*100);
            int d=cont/10;
            int u=cont%10;
            int algo = ((m*10)+c)+((d*10)+u);
            if(algo==nums[x]){
                batata[x]=true;
            }
            else{
                batata[x]=false;
            }
        }
        return batata;
    }
    public boolean [] capicua(){
        boolean [] batata = new boolean[qt];
        for(int x=0; x<qt; x++){
            String um = "";
            um=um+nums[x];
            String contraste = "";
            for(int y=3; y>=0; y--){
                contraste=contraste + um.substring(y,y+1);
            }
            if(contraste.equals(um)){
                batata[x]=true;
            }
            else{
                batata[x]=false;
            }
        }
        return batata;
    }
}