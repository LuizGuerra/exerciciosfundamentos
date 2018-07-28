public class ex1{
    public static void main(String args[]){
        System.out.print("\f");
        int soma = 0;

        for(int x=1; x<1000; x++){
            if(x%3==0 ||x%5==0){
                System.out.print(", "+x);
                soma=soma+x;
            }
        }
        System.out.println("==========================");
        System.out.println("==========================");
        
        System.out.println(soma);
    }
}