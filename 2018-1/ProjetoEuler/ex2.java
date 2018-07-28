public class ex2{
    public static void main(String args[]){
        int soma=0;
        int old=1, novo=1;        
        int F = 0;
        int ant = 0;
        for (int i = 1; F<=4000000; i++){
            //System.out.println(F);
            if(F%2==0){soma=soma+F;}
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        System.out.println(soma);
    }
}