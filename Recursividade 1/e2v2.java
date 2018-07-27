import java.util.Scanner;
public class e2v2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int z=1;
        while(z==1){
            System.out.println("Informe um valor inteiro e positivo: ");
            int valor = in.nextInt();
            while(valor<=0){
                System.out.println("Valor não inteiro e positivo. Tente novamente. ");
                valor=in.nextInt();
            }
            //System.out.println("As somatórias possíveis do número "+ valor +" são "+ somatoria(valor));
            System.out.println("Total de somatorias possíveis do num "+valor+" são: "+quantasSomatorias(valor));
            System.out.println("");
            //System.out.println("Informe 1 para continuar a simulação.");
            //z=in.nextInt();
        }
    }
        public static String somatoria(int num){
        int x, soma1=0, soma2=0;
        String somatoria="--- ";
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
                }
            }
            soma2=0;
        }
        return somatoria;
    }
    public static int quantasSomatorias(int num){
        int x, soma1=0, soma2=0;
        String somatoria="--- ";
        int cont=0;
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
        return cont;
    }
}