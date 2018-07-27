public class exer3{
    public static void main(String args[]){
        int soma = 0;
        for(int i=501;i<700;i=i+2){
            soma=soma+i;
        }
        System.out.println("\fA soma de todos os termos ímpares entre 500 e 700 é: " + soma);
        
        int x=501,y=0;
        while(x<700){
            y=y+x;
            x=x+2;
        }
        System.out.println("A soma vai dar " + y);
    }
}